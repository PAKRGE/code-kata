package org.example;

import java.util.Arrays;
import java.util.List;

public class SecretCode {
    public static void main(String[] args) {
        String s = "fiwer";
        String skip = "biwnr";
        int index = 5;
        String result = solution(s, skip, index);
        System.out.println("결과 : " + result);
    }

    public static String solution(String s, String skip, int index) {
        String[] alphabet = {
                "a", "b", "c", "d", "e",
                "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y",
                "z"
        };
        List<String> alphabetList = Arrays.asList(alphabet);
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            int alphabetIndex = alphabetList.indexOf(Character.toString(s.charAt(i)));
            String changeChar = "";
            for (int idx = 0; idx < index; idx++) {
                alphabetIndex++;
                if (alphabetIndex == 26) {
                    alphabetIndex = 0;
                }
                if (skip.contains(alphabet[alphabetIndex])) {
                    idx--;
                }
                changeChar = alphabet[alphabetIndex];
            }
            answer = answer + changeChar;
        }
        return answer;
    }
}

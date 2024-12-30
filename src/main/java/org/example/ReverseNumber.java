package org.example;

public class ReverseNumber {
    public static void main(String[] args) {
        int ipnut = 45623;

        int result = solution(ipnut);
        System.out.println(result);
    }

    public static int solution(int input) {
        int resultNum = 0;
        int divide = input / 10;
        int digitNum = 10;

        if(input == 0) {
            return input;
        }

        if (input > 0) {
            resultNum = input % 10;
            while (divide > 1) {
                resultNum = resultNum * 10 + divide % 10;
                digitNum = digitNum * 10;
                divide = divide / 10;
            }
        } else {
            int changeNum = -1;
            divide = divide * changeNum;
            resultNum = (input * changeNum) % 10;
            while (divide > 1) {
                resultNum = (resultNum * 10) + (divide % 10);
                digitNum = digitNum * 10;
                divide = divide / 10;
            }
            resultNum = resultNum * changeNum;
        }
        return resultNum;
    }
}

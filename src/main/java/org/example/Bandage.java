package org.example;

public class Bandage {
    public static void main(String[] args) {
        int[] bandage = {
                5, 1, 5
        };
        int health = 30;
        int[][] attacks = {
                {2, 10},
                {9, 15},
                {10, 5},
                {11, 5}
        };

        int result = solution(bandage, health, attacks);
        System.out.println("결과 : " + result);
    }

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int bandTime = 0;
        int attackTime = 0;
        int answer = health;

        for (int[] attack : attacks) {
            while (attackTime < attack[0]) {
                bandTime++;
                attackTime++;
                if (attack[0] == attackTime) {
                    bandTime = 0;
                    answer = answer - attack[1];
                    break;
                } else {
                    answer = answer + bandage[1];
                }
                if (bandTime == bandage[0]) {
                    bandTime = 0;
                    answer = answer + bandage[2];
                }
                if (answer > health) {
                    answer = health;
                }
            }
            if (answer < 1) {
                return -1;
            }

        }
        return answer;
    }
}

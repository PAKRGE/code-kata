package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CraneGame {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int result = solution(board, moves);
        System.out.println("CraneGame result : " + result);
    }

    public static int solution(int[][] board, int[] moves) {
        List<Integer> basket = new ArrayList<>();
        int answer = 0;

        for (int move : moves) {
            int moveIndex = move - 1;
            for (int i = 0; i < board.length; i++) {
                if (board[i][moveIndex] != 0) {
                    if (!basket.isEmpty()) {
                        if (basket.getLast() == board[i][moveIndex]) {
                            board[i][moveIndex] = 0;
                            answer = answer + 2;
                            basket.removeLast();
                            break;
                        }
                    }
                    basket.add(board[i][moveIndex]);
                    board[i][moveIndex] = 0;
                    break;
                }
            }
            System.out.println("move : " + move);
            System.out.println("basket : " + basket);
            System.out.println("board : " + Arrays.deepToString(board));
        }
        return answer;
    }
}

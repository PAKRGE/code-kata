package org.example;

public class NeighborChecker {
    public static void main(String[] args) {
        String[][] board = {
                {"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"}
        };
        int h = 1;
        int w = 3;
        int result = solution(board, h, w);

        System.out.println("result : " + result);

    }

    public static int solution(String[][] board, int h, int w) {
        int count = 0;
        int[] dh = {
                0, 1, -1, 0
        };
        int[] dw = {
                1, 0, 0, -1
        };
        int len = board[0].length;
        for(int i = 0; i < 4; i++) {
            int h_check = h - dh[i];
            int w_check = w - dw[i];
            if(h_check >= len || w_check >= len) continue;
            if(h_check < 0 || w_check < 0) continue;
            count = (board[h][w].equals(board[h_check][w_check])) ? count + 1 : count;
        }

        return count;
    }
}

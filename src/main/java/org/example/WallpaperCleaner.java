package org.example;

import java.util.Arrays;

public class WallpaperCleaner {
    public static void main(String[] args) {
        String[] wallpaper = {
                "#....",
                ".....",
                "....#"
        };
        int[] result = solution(wallpaper);
        System.out.println("결과 : " + Arrays.toString(result));
    }

    public static int[] solution(String[] wallpaper) {
        int lux = 100;
        int luy = 100;
        int rdx = -1;
        int rdy = -1;

        for(int i = 0; i < wallpaper.length; i++) {
            String row = wallpaper[i];
            for(int j = 0; j < row.length(); j++) {
                if(row.charAt(j) == '#') {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                }
            }
        }
        return new int[]{lux, luy, rdx + 1, rdy + 1};
    }
}

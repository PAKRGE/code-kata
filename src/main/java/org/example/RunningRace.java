package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RunningRace {
    public static void main(String[] args) {
        String[] players = {
                "sfasd", "herfsdf", "test", "test2", "test3"
        };

        String[] callings = {
                "test3", "test", "test", "sfasd"
        };
        String[] result = solution(players, callings);
        System.out.println("result : " + Arrays.toString(result));
    }

    public static String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        Map<String, Integer> playerMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }

        for (String call : callings) {
            if(playerMap.get(call) != 0) {

                int privPlayerRank = playerMap.get(answer[playerMap.get(call) - 1]);
                int nowPlayerRank = playerMap.get(call);

                answer[nowPlayerRank] = answer[privPlayerRank];
                answer[privPlayerRank] = call;

                playerMap.put(answer[nowPlayerRank - 1], privPlayerRank + 1);
                playerMap.put(call, playerMap.get(call) - 1);
            }
        }

        return answer;
    }
}

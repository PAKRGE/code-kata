package org.example;

public class TuchKeypad {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        String answer = solution(numbers, hand);
        System.out.println("TuchKeypad : " + answer);
    }

    public static String solution(int[] numbers, String hand) {
        final LeftThumb leftThumb = new LeftThumb(0, 0);
        final RightThumb rightThumb = new RightThumb(0, 0);
        int index = 0;
        String answer = "";


        while (index < numbers.length) {
            if (numbers[index] == 1 || numbers[index] == 4 || numbers[index] == 7) {
                leftThumb.thumbMove(numbers[index]);
                answer += "L";
            } else if (numbers[index] == 3 || numbers[index] == 6 || numbers[index] == 9) {
                rightThumb.thumbMove(numbers[index]);
                answer += "R";
            } else {
                int leftdistanceCheck = distanceCheck(numbers[index], leftThumb.horizonNum, leftThumb.perpendicularNum);
                int rightdistanceCheck = distanceCheck(numbers[index], rightThumb.horizonNum, rightThumb.perpendicularNum);

                if (leftdistanceCheck == rightdistanceCheck) {
                    if (hand.equals("right")) {
                        rightThumb.thumbMove(numbers[index]);
                        answer += "R";
                    } else {
                        leftThumb.thumbMove(numbers[index]);
                        answer += "L";
                    }
                } else if (leftdistanceCheck < rightdistanceCheck) {
                    leftThumb.thumbMove(numbers[index]);
                    answer += "L";
                } else {
                    rightThumb.thumbMove(numbers[index]);
                    answer += "R";
                }
            }
            index++;
        }
        return answer;
    }

    public static int distanceCheck(int num, int horizonNum, int perpendicularNum) {
        int moveCnt = 0;
        if (horizonNum == 0) {
            moveCnt++;
        }
        if (num == 0) {
            moveCnt = moveCnt + perpendicularNum;
        } else if (num == 8) {
            if ((perpendicularNum - 1) < 0) {
                moveCnt = moveCnt + ((perpendicularNum - 1) * -1);
            } else {
                moveCnt = moveCnt + (perpendicularNum - 1);
            }
        } else if (num == 5) {
            if ((perpendicularNum - 2) < 0) {
                moveCnt = moveCnt + ((perpendicularNum - 2) * -1);
            } else {
                moveCnt = moveCnt + (perpendicularNum - 2);
            }

        } else {
            if ((perpendicularNum - 3) < 0) {
                moveCnt = moveCnt + ((perpendicularNum - 3) * -1);
            } else {
                moveCnt = moveCnt + (perpendicularNum - 3);
            }
        }
        return moveCnt;
    }

    public static class Thumb {
        public Thumb(int perpendicularNum, int horizonNum) {
            this.perpendicularNum = perpendicularNum;
            this.horizonNum = horizonNum;
        }

        int perpendicularNum;
        int horizonNum;
    }


    public static class LeftThumb extends Thumb {
        public LeftThumb(int perpendicularNum, int horizoNum) {
            super(perpendicularNum, horizoNum);
        }

        public void thumbMove(int number) {
            if (number == 1) {
                horizonNum = 0;
                perpendicularNum = 3;
            } else if (number == 4) {
                horizonNum = 0;
                perpendicularNum = 2;
            } else if (number == 7) {
                horizonNum = 0;
                perpendicularNum = 1;
            } else if (number == 0) {
                horizonNum = 1;
                perpendicularNum = 0;
            } else if (number == 8) {
                horizonNum = 1;
                perpendicularNum = 1;
            } else if (number == 5) {
                horizonNum = 1;
                perpendicularNum = 2;
            } else if (number == 2) {
                horizonNum = 1;
                perpendicularNum = 3;
            }
        }
    }

    public static class RightThumb extends Thumb {
        public RightThumb(int perpendicularNum, int horizoNum) {
            super(perpendicularNum, horizoNum);
        }

        public void thumbMove(int number) {
            if (number == 3) {
                horizonNum = 0;
                perpendicularNum = 3;
            } else if (number == 6) {
                horizonNum = 0;
                perpendicularNum = 2;
            } else if (number == 9) {
                horizonNum = 0;
                perpendicularNum = 1;
            } else if (number == 0) {
                horizonNum = 1;
                perpendicularNum = 0;
            } else if (number == 8) {
                horizonNum = 1;
                perpendicularNum = 1;
            } else if (number == 5) {
                horizonNum = 1;
                perpendicularNum = 2;
            } else if (number == 2) {
                horizonNum = 1;
                perpendicularNum = 3;
            }
        }
    }
}

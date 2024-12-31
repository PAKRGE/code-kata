package org.example;

public class PalinCheck {
    private final int value;

    public PalinCheck(int value) {
        this.value = value;
    }

    public boolean solution() {
        if (value < 1) {
            return false;
        }
        int reverseNum = 0;
        int whileNum = value;
        while (whileNum > 0) {
            reverseNum = (reverseNum * 10) + (whileNum % 10);
            whileNum = whileNum / 10;
        }
        if(value == reverseNum) {
            return true;
        }

        return false;
    }


}

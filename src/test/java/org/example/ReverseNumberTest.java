package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("숫자 뒤집기")
class ReverseNumberTest {
    @Test
    void testPositiveNumber() {
        int inputNum = 123;
        ReverseNumber.solution(inputNum);
    }

    @Test
    void testNegativeNumber() {
        int inputNum = -123;
        ReverseNumber.solution(inputNum);
    }

    @Test
    void testSingleDigit() {
        int inputNum = 5;
        ReverseNumber.solution(inputNum);
    }

    @Test
    void testZero() {
        int inputNum = 0;
        ReverseNumber.solution(inputNum);
    }
}
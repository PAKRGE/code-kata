package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("숫자 뒤집기")
class ReverseNumberTest {
    @Test
    void testPositiveNumber() {
        int inputNum = 123;
        int result = ReverseNumber.solution(inputNum);
        int actual = 321;
        assertEquals(result, actual);
    }

    @Test
    void testNegativeNumber() {
        int inputNum = -123;
        int result = ReverseNumber.solution(inputNum);
        int actual = -321;
        assertEquals(result, actual);
    }

    @Test
    void testSingleDigit() {
        int inputNum = 5;
        int result = ReverseNumber.solution(inputNum);
        int actual = 5;
        assertEquals(result, actual);
    }

    @Test
    void testZero() {
        int inputNum = 0;
        int result = ReverseNumber.solution(inputNum);
        int actual = 0;
        assertEquals(result, actual);
    }
}
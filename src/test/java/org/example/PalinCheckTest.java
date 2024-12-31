package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("회문 확인")
class PalinCheckTest {
    @Test
    void 음수는_회문이_아니다() {
        boolean result = new PalinCheck(-121).solution();
        boolean actual = false;
        Assertions.assertEquals(result, actual);
    }

    @Test
    void 숫자121는_회문이다() {
        boolean result = new PalinCheck(121).solution();
        boolean actual = true;
        Assertions.assertEquals(result, actual);
    }

    @Test
    void 숫자123은_회문이_아니다() {
        boolean result = new PalinCheck(123).solution();
        boolean actual = false;
        Assertions.assertEquals(result, actual);
    }

    @Test
    void 숫자1221은_회문이다() {
        boolean result = new PalinCheck(1221).solution();
        boolean actual = true;
        Assertions.assertEquals(result, actual);
    }

    @Test
    void 숫자1231은_회문이_아니다() {
        boolean result = new PalinCheck(1231).solution();
        boolean actual = false;
        Assertions.assertEquals(result, actual);
    }
}
package com.leetcode.ease.algos.fifty.eight;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution testObj = new Their();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void lengthOfLastWord(String s, int expected) {
        int actual = testObj.lengthOfLastWord(s);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("Hello World", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("AumsdgOVRB", 10),
                Arguments.of("luffy is still joyboy", 6)
        );
    }
}

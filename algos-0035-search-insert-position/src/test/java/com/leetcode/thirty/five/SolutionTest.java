package com.leetcode.thirty.five;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution testObj = new My_1();

    @ParameterizedTest
    @MethodSource("provideTestData")
    void searchInsert(int[] nums, int target, int expected) {
        int actual = testObj.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
                Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
                Arguments.of(new int[]{1, 3, 5, 6}, 7, 4),
                Arguments.of(new int[]{1, 3}, 2, 1)
        );
    }
}
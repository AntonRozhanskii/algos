package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution testObj = new MySolution();

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void removeElement(int[] nums, int val, int expectedLength, int[] expectedArray) {
        int actualLength = testObj.removeElement(nums, val);
        assertEquals(expectedLength, actualLength);

        int[] actualResultArray = new int[actualLength];
        for (int i = 0; i < expectedLength; i++) {
            actualResultArray[i] = nums[i];
        }
        assertArrayEquals(expectedArray, actualResultArray);
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(new int[]{}, 3, 0, new int[]{}),
                Arguments.of(new int[]{20, 21}, 3, 2, new int[]{20, 21}),
                Arguments.of(new int[]{3, 2, 2, 3}, 3, 2, new int[] {2, 2}),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5, new int[]{0, 1, 3, 0, 4})
        );
    }
}

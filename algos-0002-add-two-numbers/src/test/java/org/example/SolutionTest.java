package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.example.service.ListNodeProvider.generate;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final MySolution testObj = new MySolution();

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void addTwoNumbers(ListNode list1, ListNode list2, ListNode expected) {
        ListNode actual = testObj.addTwoNumbers(list1, list2);

        assertEquals(expected, actual);
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(null, null, null),
                Arguments.of(generate(2, 4, 3), generate(5, 6, 4), generate(7, 0, 8)),
                Arguments.of(generate(0), generate(0), generate(0)),
                Arguments.of(generate(9, 9, 9, 9, 9, 9, 9), generate(9, 9, 9, 9), generate(8, 9, 9, 9, 0, 0, 0, 1))
        );
    }
}
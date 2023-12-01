package org.example;

import org.example.service.ListNodeProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.example.service.ListNodeProvider.generate;
import static org.example.service.ListNodeProvider.print;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution testObj = new Solution();

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void mergeTwoLists(ListNode list1, ListNode list2, ListNode expected) {
        ListNode actual = testObj.mergeTwoLists(list1, list2);

        System.out.print(">>Expected: ");
        print(expected);
        System.out.print(">>>Actual: ");
        print(actual);

        assertEquals(expected, actual);
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(null, null, null),
                Arguments.of(generate(1, 2, 4), generate(1, 3, 4), generate(1, 1, 2, 3, 4, 4)),
                Arguments.of(generate(1, 3, 4), generate(2), generate(1, 2, 3, 4)),
                Arguments.of(generate(1, 2, 4, 5, 7), generate(1, 3, 4), generate(1, 1, 2, 3, 4, 4, 5, 7)),
                Arguments.of(generate(), generate(), generate()),
                Arguments.of(generate(), generate(0), generate(0))
        );
    }

    @Test
    void providerTest() {
        ListNode someNode = generate(2, 2, 3, 4);
        ListNodeProvider.print(someNode);
    }
}

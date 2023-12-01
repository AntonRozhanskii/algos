package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheirSolutionTest {

    private final TheirSolution testObj = new TheirSolution();

    @Disabled("'Their' solution was not copied")
    @ParameterizedTest
    @MethodSource("testDataProvider")
    void isValid(String s, boolean expected) {
        boolean actual = testObj.isValid(s);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("((", false),
                Arguments.of("[", false)
        );
    }
}
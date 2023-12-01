package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MySolutionOne {

    private static final Map<Character, Character> PARENTHESES = new HashMap<>();

    static {
        PARENTHESES.put(')', '(');
        PARENTHESES.put('}', '{');
        PARENTHESES.put(']', '[');
    }

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> buffer = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!PARENTHESES.containsKey(c)) {
                buffer.push(c);
            } else {
                if (buffer.isEmpty()) {
                    return false;
                }
                Character expected = buffer.pop();
                if (!expected.equals(PARENTHESES.get(c))) {
                    return false;
                }
            }
        }
        return buffer.isEmpty();
    }
}
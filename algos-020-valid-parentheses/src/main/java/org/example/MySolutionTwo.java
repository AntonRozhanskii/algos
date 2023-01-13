package org.example;

import java.util.*;

public class MySolutionTwo {

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> buffer = new Stack<>();
        for (Character c : s.toCharArray()) {
            switch (c) {
                case '}':
                case ')':
                case ']':
                    if (!isValidWithBuffer(c, buffer)) return false;
                    break;
                default:
                    buffer.push(c);
            }
        }
        return buffer.isEmpty();
    }

    private boolean isValidWithBuffer(char underTest, Stack<Character> buffer){
        if (buffer.isEmpty()) {
            return false;
        }
        switch (underTest) {
            case '}':
                if (!buffer.pop().equals('{')) return false;
                break;
            case ']':
                if (!buffer.pop().equals('[')) return false;
                break;
            case ')':
                if (!buffer.pop().equals('(')) return false;
                break;
        }
        return true;
    }
}
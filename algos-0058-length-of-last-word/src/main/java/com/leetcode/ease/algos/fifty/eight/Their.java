package com.leetcode.ease.algos.fifty.eight;

public class Their implements Solution{

    @Override
    public int lengthOfLastWord(String s) {
        int counter = 0;
        boolean hasStarted = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char current = s.charAt(i);
            if (current == ' ') {
                if (hasStarted){
                    return counter;
                }
            } else {
                if (!hasStarted) {
                    hasStarted = true;
                }
                counter++;
            }
        }
        return counter;
    }
}

package com.leetcode.ease.algos.fifty.eight;

public class Mine_01 implements Solution {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(" ");
        if (lastSpaceIndex == -1) {
            return s.length();
        }
        return s.substring(lastSpaceIndex + 1).length();
    }
}

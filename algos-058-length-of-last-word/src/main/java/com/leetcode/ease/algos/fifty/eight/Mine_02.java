package com.leetcode.ease.algos.fifty.eight;

public class Mine_02 implements Solution{

    @Override
    public int lengthOfLastWord(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}

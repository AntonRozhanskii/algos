public class MySolution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String longestPossible = strs[strs.length - 1];
        for (int i = strs.length - 2; i >= 0; i--) {
            if (strs[i].length() < longestPossible.length()) {
                longestPossible = strs[i];
            }
            if (longestPossible.length() == 0) {
                return "";
            }
        }
        StringBuilder result = new StringBuilder();
        int symbolMaxIndex = longestPossible.length() - 1;
        int stringMaxIndex = strs.length - 1;
        boolean appendFlag = true;
        for (int i = 0; i <= symbolMaxIndex; i++) {
            char current = longestPossible.charAt(i);
            for (int j = 0; j <= stringMaxIndex; j++) {
                if (strs[j].charAt(i) != current) {
                    appendFlag = false;
                    break;
                }
            }
            if (appendFlag) {
                result.append(current);
            }
        }
        return result.toString();
    }
}

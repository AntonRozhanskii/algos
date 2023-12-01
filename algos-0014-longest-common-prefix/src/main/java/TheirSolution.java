import java.util.Arrays;

public class TheirSolution {

    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return strs[0];
        }

        Arrays.sort(strs);
        StringBuilder prefix = new StringBuilder();
        String first = strs[0];
        String last = strs[length -1];
        int maxPossiblePrefixLength = Math.min(first.length(), last.length()) - 1;
        for (int i = 0; i <= maxPossiblePrefixLength; ) {
            if (first.charAt(i) != last.charAt(i)){
                break;
            }
            prefix.append(first.charAt(i));
            i++;
        }
        return prefix.toString();
    }
}

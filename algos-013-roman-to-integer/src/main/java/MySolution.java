import java.util.HashMap;
import java.util.Map;

public class MySolution {

    private static final Map<String, Integer> SYMBOL_MAP = new HashMap<>();

    static {
        SYMBOL_MAP.put("I", 1);
        SYMBOL_MAP.put("V", 5);
        SYMBOL_MAP.put("X", 10);
        SYMBOL_MAP.put("L", 50);
        SYMBOL_MAP.put("C", 100);
        SYMBOL_MAP.put("D", 500);
        SYMBOL_MAP.put("M", 1000);
    }

    public int romanToInt(String s) {
        String[] chars = s.split("");
        int maxIndex = chars.length - 1;
        int result = 0;
        int index = 0;
        while(index <= maxIndex) {
            int currentSymbolValue = SYMBOL_MAP.get(chars[index]);
            if (index == maxIndex) {
                result += currentSymbolValue;
                break;
            }
            int nextSymbolValue = SYMBOL_MAP.get(chars[index + 1]);
            if (currentSymbolValue >= nextSymbolValue) {
                result += currentSymbolValue;
                index += 1;
            } else {
                result += nextSymbolValue - currentSymbolValue;
                index += 2;
            }
        }
        return result;
    }
}

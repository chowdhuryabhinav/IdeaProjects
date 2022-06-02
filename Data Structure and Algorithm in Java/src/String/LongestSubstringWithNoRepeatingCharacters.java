package String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithNoRepeatingCharacters {

    public static int longestSubstringLengthWithNoRepeatedCharacters(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }

        Map<Character, Integer> map = new HashMap<>();
        int start, end;
        int maxLength = 0;

        start = end = 0;
        while (end < str.length()) {
            char currentChar = str.charAt(end);

            if (map.containsKey(currentChar)) {
               start =  Math.max(start, map.get(currentChar) + 1);

            }

            map.put(currentChar, end);
            maxLength = Math.max(end - start + 1, maxLength);

            end++;
        }
        return maxLength;

    }

    public static void main(String[] args) {
        String str = "bcdcbababd";
        System.out.println(longestSubstringLengthWithNoRepeatedCharacters(str));
    }
}

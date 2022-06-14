package String;

/*You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

 Return the length of the longest substring containing the same letter you can get after performing the above operations.

 Input: s = "ABAB", k = 2

Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa./*

 */

import java.util.HashMap;
import java.util.Map;

//Leetcode(Coding Simplified)
public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int start, end, maxLength, maxFrequency;

        start = end = maxLength = maxFrequency = 0;

        while (end < s.length()) {
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);

            maxFrequency = Math.max(maxFrequency, map.get(s.charAt(end)));

            if (end - start + 1 - maxFrequency > k) {
                map.put(s.charAt(start), map.get(s.charAt(start)) - 1);
                start++;

            }

            maxLength = Math.max(maxLength, end - start + 1);

            end++;
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String str = "bccbababd";
        int k = 2;

        System.out.println(characterReplacement(str, k));


    }
}

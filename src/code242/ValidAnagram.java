package code242;

import java.util.*;

public class ValidAnagram {

}

// LeetCode 242. Valid Anagram
// Hash Table
// Time complexity: O(n), Space Complexity: 0(n)
// Comment: The solutions in LeetCode is much simpler.
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String letter = Character.toString(s.charAt(i));
            if (map.containsKey(letter)) {
                int value = map.get(letter);
                value = value + 1;
                map.put(letter, value);
            } else {
                map.put(letter, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            String letter = Character.toString(t.charAt(i));
            if (!map.containsKey(letter)) {
                return false;
            }
            int num = map.get(letter);
            num = num - 1;
            if (num == 0) {
                map.remove(letter);
            } else {
                map.put(letter, num);
            }
        }
        return true;
    }
}

package code217;

import java.util.*;

public class ContainsDuplicate {
	
}


// LeetCode 217. Contains Duplicate
// HashTable Approach - Time: O(n), Space: O(n)
// Better Approach: Use HashSet to make it simpler (No need to store index in HashMap)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // key: number, value: index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

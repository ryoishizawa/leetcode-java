class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create hash table - key: integer, value: index
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        // culculate
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            // if you can get has value from table, return and finish
            Integer index = hashMap.get(value);
            if (index != null && index != i) {
                return new int[]{i, index};
            }
        }
        return null;
    }
}

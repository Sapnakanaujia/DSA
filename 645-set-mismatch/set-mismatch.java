class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int dup = -1, mis = -1;

        // Step 1: Detect the duplicate by marking visited indices negative
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;  // get actual index (0-based)
            if (nums[index] < 0)
                dup = Math.abs(nums[i]);        // duplicate found
            else
                nums[index] *= -1;              // mark as visited
        }

        // Step 2: Find the missing number (index not visited => positive)
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                mis = i + 1;                    // missing number is (index+1)
                break;
            }
        }

        return new int[]{dup, mis};
    }
}

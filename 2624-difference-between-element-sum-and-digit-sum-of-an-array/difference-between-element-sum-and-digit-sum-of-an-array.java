class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;     // Sum of elements
        int dSum = 0;    // Sum of digits of all elements
        
        for (int num : nums) {
            sum += num;
            int temp = num;
            while (temp > 0) {
                dSum += temp % 10;
                temp /= 10;
            }
        }
        
        return Math.abs(sum - dSum);
    }
}
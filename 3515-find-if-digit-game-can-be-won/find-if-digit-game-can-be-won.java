class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
           for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 1 && nums[i] <= 9) {   // 1 to 9
                sum1 += nums[i];
            } else if (nums[i] >= 10 && nums[i] <= 99) { // 10 to 99
                sum2 += nums[i];
            }
            // agar 100+ ya negative hua toh skip ho jaayega
        }
         if(sum1!=sum2) return true;
         return false;
    }
}
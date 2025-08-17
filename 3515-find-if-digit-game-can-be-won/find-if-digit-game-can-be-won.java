class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
           for (int num : nums) {
            if (num >= 1 && num <= 9) {        // 1-digit
                sum1 += num;
            } else if (num >= 10 && num <= 99) { // 2-digit
                sum2 += num;
            }
        }
         if(sum1!=sum2) return true;
         return false;
    }
}
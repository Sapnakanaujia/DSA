class Solution {
    public int hammingWeight(int n) {
        int helper = 1;
        int count = 0;

        for (int i = 0; i <= 32; i++) {
            if ((helper & n) != 0) {
                count++;
            }
            helper = helper << 1;
        }
        return count;
    }
}
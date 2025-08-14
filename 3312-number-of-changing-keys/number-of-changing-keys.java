class Solution {
    public int countKeyChanges(String s) {
        int count=0;
        String lower= s.toLowerCase();
        for(int i=1;i<lower.length();i++){
            if(lower.charAt(i-1)!=lower.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
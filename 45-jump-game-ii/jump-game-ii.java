class Solution {
    public int jump(int[] arr) {
        int currReach=0;
        int currMax=0;
        int jumps=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]+i>currMax){
                currMax=arr[i]+i;
            }
            if(i==currReach){
                jumps++;
                currReach=currMax;
            }
        }
        return jumps;
    }
}
class Solution {
    public long zeroFilledSubarray(int[] arr) {
        long res=0;
        int n =arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) {
                count++;
            }else{
                count=0;
            }
            res=res+count;
        }
        return res;
    }
}
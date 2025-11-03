class Solution {
    public long zeroFilledSubarray(int[] arr) {
        long res=0;
        int n =arr.length;
        int i=0;
        while(i<n){
            long l=0;
            if(arr[i]==0){
                while(i<n && arr[i]==0){
                    i++;
                    l++;
                }
            }
            else i++;
            res +=(l)*(l+1)/2;
        }
        
        return res;
    }
}
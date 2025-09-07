class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int ans= Integer.MAX_VALUE;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[lo]<=arr[mid]){
                ans=Math.min(ans,arr[lo]);
                lo=mid+1;
            } else{
                ans= Math.min(ans,arr[mid]);
                hi=mid-1;
            }
        
        }
        return ans;
    }
}
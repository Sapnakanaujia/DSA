class Solution {
    public int[] getAverages(int[] arr, int k) {
        int n= arr.length;
        if(k==0)
            return arr;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i]=-1;
        }
        if(n<2*k+1){
            return res;
        }
        long[] prefix=new long[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=k;i<=n-k-1;i++){
            int left_idx=i-k;
            int right_idx=i+k;
            long sum=prefix[right_idx];
            if(left_idx>0){
                sum-=prefix[left_idx-1];
            }
            res[i]=(int)(sum/(2*k+1));
        }
        return res;
    }
}
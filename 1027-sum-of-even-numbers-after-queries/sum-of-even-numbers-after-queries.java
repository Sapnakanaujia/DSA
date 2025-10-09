class Solution {
    public int[] sumEvenAfterQueries(int[] arr, int[][] que) {
        int n= arr.length;
        int m= que.length;
        int sumEven=0;
        
        for(int i: arr){
            if(i%2==0) sumEven+=i;
        }
        int[] res=new int[m];
        for(int i=0;i<m;i++){
            int val=que[i][0];
            int idx=que[i][1];
            if(arr[idx]%2==0) sumEven-=arr[idx];
            arr[idx]+=val;
            if(arr[idx]%2==0) sumEven+=arr[idx];
        
            res[i]=sumEven;
        }
    return res;
    }
}
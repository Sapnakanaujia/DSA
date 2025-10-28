class Solution {
    public int findJudge(int n, int[][] arr) {
      int[] cnt= new int[n+1];
        for(int[] num:arr){
            int u=num[0];
            int v=num[1];
            cnt[u]--;
            cnt[v]++;

        }
        for(int i=1;i<=n;i++){
            if(cnt[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}
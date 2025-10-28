class Solution {
    public int findJudge(int n, int[][] arr) {
      int[] l1= new int[n+1];
      int[] l2 =new int[n+1];;
        for(int[] num:arr){
            int u=num[0];
            int v=num[1];
            l1[u]++;
            l2[v]++;

        }
        for(int i=1;i<=n;i++){
            if(l2[i]==n-1 && l1[i]==0){
                return i;
            }
        }
        return -1;
    }
}
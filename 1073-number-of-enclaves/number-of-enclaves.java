class Solution {
    int n, m;
    public void dfs(int[][] arr, int i,int j){
        if(i<0 || i>=m || j<0 || j>=n || arr[i][j]==0){
            return ;
        }
        arr[i][j]=0;
        dfs(arr,i,j+1);
        dfs(arr,i,j-1);
        dfs(arr,i-1,j);
        dfs(arr,i+1,j);

    }
    public int numEnclaves(int[][] arr) {
         m= arr.length;
         n= arr[0].length;
       
        for(int row=0;row<m;row++){
                if(arr[row][0]==1){
                    dfs(arr, row,0);
                }
                if(arr[row][n-1]==1){
                    dfs(arr, row,n-1);
                }
        }
        for(int col=0;col<n-1;col++){
                if(arr[0][col]==1){
                    dfs(arr, 0,col);
                }
                if(arr[m-1][col]==1){
                    dfs(arr, m-1,col);
                }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}
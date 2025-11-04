class Solution {
    int m,n;
    public boolean dfs(int[][] arr, int i,int j){
        if(i>=m || i<0 || j>=n ||j<0) return false;
        if(arr[i][j]==1){
            return true;
        }
        arr[i][j]=1;
        boolean left=dfs(arr,i,j-1);
        boolean right=dfs(arr,i,j+1);
        boolean up=dfs(arr,i-1,j);
        boolean down=dfs(arr,i+1,j);
        return left && right && up && down;
    }


    public int closedIsland(int[][] arr) {
        m=arr.length;
        n=arr[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(arr[i][j]==0){
                if(dfs(arr,i,j)==true) count++;
               } 
            }
        }
        return count;
    }
}
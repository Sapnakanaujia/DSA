class Solution {
    public int[] findBall(int[][] grid) {
        int n= grid.length;
        int m= grid[0].length;
        int[] res= new int[m];
        for(int ball=0;ball<m;ball++){
        int row=0;
        int col=ball;
        boolean atka=false;
            while(row<n && col<m){
                if(grid[row][col]==1){
                    if(col==m-1 || grid[row][col+1]==-1){
                        atka= true;
                        break;
                    }
                    col++;
                    }
                else{
                    if(col==0 || grid[row][col-1]==1){
                        atka =true;
                        break;
                    }
                    col--;
                    }
                row++;
                }
                if(atka){
                res[ball]=-1;
                }
                else{
                    res[ball]=col;
                }
            }   
           
        return res;
    }
}
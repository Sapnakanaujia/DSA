class Solution {
    static void queen(char[][] q, int row,  List<List<String>> ans){
        if(row==q.length){
            ans.add(makeString(q));
            return;
        }
        
        for(int col=0;col<q.length;col++){
            if(isSafe(q,row, col)){
                q[row][col]='Q';
                queen(q,row+1,ans);
                q[row][col]='.';
            }
        }
    }

    static boolean isSafe(char[][] q, int row,int col){
        for(int i=0;i<row;i++){
            if(q[i][col]=='Q') return false; 
        }
        int maxleft = Math.min(row, col);
        for(int i=1;i<=maxleft;i++){
            if(q[row-i][col-i]=='Q') return false;
        }
        int maxright= Math.min(row,q.length-1-col);

        for(int i=1;i<=maxright;i++){
            if(q[row-i][col+i]=='Q') return false;
        }
        return true;
    }
   
    public List<List<String>> solveNQueens(int n) {
        char[][] q= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                q[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        queen(q,0,ans);
        return ans;
    }
    static List<String> makeString(char[][] q){
    List<String> L = new ArrayList<>();
    for(int i = 0; i < q.length; i++){
        String row = new String(q[i]);
        L.add(row);
    }
    return L;
}
}
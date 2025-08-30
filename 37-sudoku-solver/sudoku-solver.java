class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isvalid(board,i,j,c)){
                            board[i][j]=c;
                            
                            if(solve(board)) return true;
                            else{
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
    return true;
}
public boolean isvalid(char[][] board, int i, int j, char c){
    for(int k=0;k<9;k++){
        if(board[i][k]==c) return false;
        if(board[k][j]==c) return false;
        int subrow=3*(i/3)+k/3;
        int subcol=3*(j/3)+k%3;
        if (board[subrow][subcol] == c) return false;
    }
    return true;
}
}
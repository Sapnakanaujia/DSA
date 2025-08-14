class Solution {
    public int xorOperation(int n, int start) {
        int[] nums= new int[n];
        int res=0;
        for(int i=0;i<n;i++){
            int num=(start+2*i);
            res = manualXOR(res, num);
        }
       return res;
    }
     public int manualXOR(int a,int b){
            return (a & ~b | ~a & b);
        }
}
class Solution {
    public int arraySign(int[] arr) {
        int n= arr.length;
        int pro=1;
        for(int i=0;i<n;i++){
            if(arr[i]<0) {
                pro*=-1;
            } else if(arr[i]>0){
                pro*=1;
            } else{
                pro*=0;
            }
        }
        return pro;
    }
}
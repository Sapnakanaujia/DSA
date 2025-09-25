class Solution {
    public int singleNumber(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<arr.length;j++){
                if(i==j) continue;
                if(arr[i]==arr[j]){
                    flag=true;
                }
            }
            if(flag==false) return arr[i];
        }
        return -1;
    }
}
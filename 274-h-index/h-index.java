class Solution {
    public int hIndex(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int h=0;
        for(int i=0;i<n;i++){
            int parse=n-i;
            if(arr[i]>=parse){
                h= parse;
                break;
            }

        }
        return h;
    }
}
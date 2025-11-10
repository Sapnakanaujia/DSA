class Solution {
    public List<String> summaryRanges(int[] arr) {
        List<String> ans= new ArrayList<>();
        int n= arr.length;
        int s=0;
        for (int i=0;i<n;i++){
            s=arr[i];
            while((i+1<n) && (arr[i+1]-arr[i])==1){
                i++;
            }
            if(s!=arr[i]){
                ans.add(s+"->"+arr[i]);
            }
            else{
                ans.add(String.valueOf(s));
            }
        }
        return ans;
    }
}
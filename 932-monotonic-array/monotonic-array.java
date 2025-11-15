class Solution {
    public boolean isMonotonic(int[] arr) {
        int n=arr.length;
        
        boolean dec=false;
        boolean inc= false;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]) 
            {   
                inc=true;
            }
            if(arr[i]>arr[i+1]) {
                dec= true;
            }
        }
        if(inc==true && dec==true) return false;
        return true;
    }
}
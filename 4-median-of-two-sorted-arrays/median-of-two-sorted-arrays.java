class Solution {
    public double findMedianSortedArrays(int[] arr, int[] arr1) {
        int n= arr.length;
        int m= arr1.length;
        int[] c= new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr[i]<=arr1[j]){
                c[k]=arr[i];
                i++;
                k++;
            }
            else{
                c[k]=arr1[j];
                j++;
                k++;
            }
        }
        if(j==m){
        while(i<n){
            c[k]=arr[i];
            i++;
            k++;
        }
        }
        if(i==n){
        while(j<m){
            c[k]=arr1[j];
            j++;
            k++;
        }
        }
            int total = n + m;
        if (total % 2 == 1) {
            // odd length → middle element
            return c[total / 2];
        } else {
            // even length → average of two middle elements
            int mid1 = c[total / 2 - 1];
            int mid2 = c[total / 2];
            return (mid1 + mid2) / 2.0;
        }
    }  
}
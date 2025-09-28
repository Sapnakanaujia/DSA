class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int n= arr.length;
        int closestSum=100000;
        Arrays.sort(arr);
        for(int k=0;k<=n-3;k++){
            int i=k+1;
            int j=n-1;
            while(i<j){
            int sum=arr[k]+arr[i]+arr[j];
            if(Math.abs(target-sum)<Math.abs(target-closestSum))
                closestSum=sum;
            
            if(sum<target)
                i++;
            else
                j--;
            }
        }
        return closestSum;
    }
}
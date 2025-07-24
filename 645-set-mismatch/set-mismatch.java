class Solution {
    public int[] findErrorNums(int[] nums) {
        int n= nums.length;
       int[] count= new int[n+1];  
       for(int num:nums){
        count[num]++;
       }
       int dup=-1, mis=-1;
       for(int i=0;i<=n;i++){
        if(count[i]==2){
            dup=i;
        }else if(count[i]==0){
            mis=i;
        }
       }
       return new int[]{dup,mis};
    }
}
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n= nums.length;
        int total=(1<<n);
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<total;i++){
            List<Integer> list= new ArrayList<>();
            for(int bitIdx=0;bitIdx<n;bitIdx++){
                int mask=1<<bitIdx;
                if((mask&i)!=0) list.add(nums[bitIdx]);
            }
            ans.add(list);
        }
        return ans;
    }
}
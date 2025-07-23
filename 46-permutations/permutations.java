class Solution {
    public void backtrack(List<List<Integer>> result, List<Integer> prem, int[] nums){
        if(prem.size()==nums.length){
            result.add(new ArrayList<>(prem));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(prem.contains(nums[i]))
                continue;
            prem.add(nums[i]);
            backtrack(result, prem, nums);
            prem.remove(prem.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> prem= new ArrayList<>();
        backtrack(result,prem,nums);
        return result;
    }
}
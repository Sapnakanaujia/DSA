import java.util.*;
class Solution {
    public void twoSum(int[] arr, int target,int i, int j,int n1, List<List<Integer>> res){
        while(i<j){
            if(arr[i]+arr[j]>target) j--;
            else if(arr[i]+arr[j]< target) i++;
            else{
                res.add(Arrays.asList(n1, arr[i], arr[j]));
                while(i<j && arr[i]==arr[i+1]) i++;
                while(i<j && arr[j]==arr[j-1]) j--;
                i++;
                j--;
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        if(n<3) return res;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int n1= nums[i];
            int target = -n1;
            twoSum(nums, target, i+1,n-1,n1,res);
        }
        return res;
    }
}
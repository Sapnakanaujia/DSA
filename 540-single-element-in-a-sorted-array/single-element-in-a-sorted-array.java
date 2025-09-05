class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int k:nums){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        int res=0;
       for(Map.Entry<Integer,Integer>key:map.entrySet()){
        if(key.getValue()==1){
            res=key.getKey();
        }
       }
        return res;
    }
}
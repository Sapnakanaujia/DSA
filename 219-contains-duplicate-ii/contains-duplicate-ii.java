class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int n= arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                if(i-map.get(arr[i])<=k){
                    return true;
                }
            }
            map.put(arr[i],i);
        }
    return false;
    }
}
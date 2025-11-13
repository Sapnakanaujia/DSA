class Solution {
    public List<List<Integer>> groupThePeople(int[] arr) {
       int n= arr.length;
       List<List<Integer>> res = new ArrayList();
      Map<Integer, List<Integer>> map = new HashMap<>();
       for(int i=0;i<n;i++){
        int L= arr[i];
         map.putIfAbsent(L, new ArrayList<>());
        map.get(L).add(i);
        if(map.get(L).size() ==L){
             res.add(new ArrayList<>(map.get(L)));
                map.get(L).clear();
        }
       }
       return res;
    }
}
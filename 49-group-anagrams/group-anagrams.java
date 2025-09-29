class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        int n= s.length;
        List<List<String>> res= new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String temp= s[i];
            char[] arr=temp.toCharArray();
            Arrays.sort(arr);
            String key= new String(arr);
           if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
           }
            map.get(key).add(temp);
        }
        res.addAll(map.values());
        return res;
    }
}
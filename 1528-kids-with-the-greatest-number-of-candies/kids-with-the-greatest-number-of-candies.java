class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extra) {
        List<Boolean> list= new ArrayList<>();
        int max=0;
        for(int c: arr){
            if(c>max){
                max=c;
            }
        }
        for(int c: arr){
            if(c+extra>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}
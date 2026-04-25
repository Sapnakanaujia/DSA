class Solution {
    public String largestOddNumber(String s) {
        int end=-1;
        for(int i=s.length()-1;i>=0;i--){
            int digit=s.charAt(i)-'0';
            if(digit%2==1){
                end=i;
                break;
            }
        }
        if(end==-1) return "";
        int start=0;

        while(start<=0 && s.charAt(start)==0) start++;
        return s.substring(start,end+1);
    }
}
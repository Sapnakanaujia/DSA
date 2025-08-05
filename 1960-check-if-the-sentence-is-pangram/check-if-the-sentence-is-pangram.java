class Solution {
    public boolean checkIfPangram(String s) {
        int n= s.length();
        for(char i='a';i<='z';i++){
            if(s.indexOf(i)==-1){
                return false;
            }
        }
        return true;
    }
}
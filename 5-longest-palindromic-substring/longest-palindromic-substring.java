class Solution {
    public boolean palindrome(String s, int i, int j){
        while(i<j){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(c1!=c2){
                return false;
            }
            i++;
            j--;


        }   
        return true;
    }
    public String longestPalindrome(String s) {
        int max=0;
        int start=0;
        int end=s.length()-1;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(palindrome(s,i,j)==true){
                    if((j-i+1)>max) {
                        max= j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
            
        }
        return s.substring(start, end+1);
    }
}
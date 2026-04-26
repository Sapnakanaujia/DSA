class Solution {
    public int maxDepth(String s) {
        int maxdepth=0;
        int depth=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') {
                depth++;
                maxdepth=Math.max(maxdepth,depth);
            }
            else if(ch==')') depth--;
        }
        return maxdepth;
    }
}
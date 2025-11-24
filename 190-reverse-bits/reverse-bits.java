class Solution {
    public int reverseBits(int n) {
        int i=0,j=31;
        while(i<j){
            int iMask=(1<<i), jMask=(1<<j);
            boolean ion=((n&iMask)!=0), jon=((n&jMask)!=0);
            if(ion!=jon){
                n^=iMask;
                n^=jMask;
            }
            i++;
            j--;
        }return n;
    }
}
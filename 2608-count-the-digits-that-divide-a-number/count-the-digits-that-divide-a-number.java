class Solution {
    public int countDigits(int num) {
        int count=0;
        int val=0;
        int temp=num;
        while(temp>0){
            val=temp%10;
            if(num%val==0){
                count++;
            }
            temp/=10;
        }
        return count;
    }
}
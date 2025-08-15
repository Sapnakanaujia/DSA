class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        //int temp=n;
        while(n>0){
            int temp=n;
            int d=temp%10;
            product*=d;
            sum+=d;
            n/=10;
        }
        int res=product-sum;
        return res;
    }
}
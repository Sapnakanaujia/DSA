class Solution {
    public int calPoints(String[] ops) {
        int[] arr= new int[ops.length];
        int sum=0;
        int index=0;
        for(int i=0;i<ops.length;i++){
            String op = ops[i];

            if (op.equals("C")){
                sum -= arr[--index];
            }
            else if(op.equals("D")){
                arr[index]=2*arr[index-1];
                sum+=arr[index++];
            }
            else if(op.equals("+")){
                arr[index]=arr[index-1]+arr[index-2];
                sum+=arr[index++];
            }
            else{
                arr[index] = Integer.parseInt(op); 
                sum+=arr[index++];
            }
        }
        return sum;
    }
}
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
           Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int sum=0;
        for(int j=0;j<boxTypes.length;j++){
            int nb= boxTypes[j][0];
            int un=boxTypes[j][1];
            int min=Math.min(nb,truckSize);
            truckSize-=min;
            sum+=min*un;
            if(truckSize==0){
                return sum;
            }
        }
        return sum;
    }
} 
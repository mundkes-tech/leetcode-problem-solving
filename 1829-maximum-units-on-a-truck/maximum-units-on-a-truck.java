class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int sum = 0;
        int count = 0;
        int i = 0;
        while (count <= truckSize && i < boxTypes.length) {
            if(boxTypes[i][0] > truckSize - count) {
                sum += ((truckSize - count) * boxTypes[i][1]);
                break;            
            }
            count += boxTypes[i][0];
            sum += (boxTypes[i][0] * boxTypes[i][1]);
            i++;
        }
        return sum;
    }
}
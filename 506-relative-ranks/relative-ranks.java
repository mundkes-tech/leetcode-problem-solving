class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sorted = score.clone();

        Arrays.sort(sorted);

        Map<Integer,Integer> map = new HashMap<>();

        int rank = 1;

        for(int i=n-1;i>=0;i--){
            map.put(sorted[i],rank);
            rank++;
        }

        String[] result = new String[n];

        for(int i=0;i<n;i++){
            int r = map.get(score[i]);

            if(r==1){
                result[i]="Gold Medal";
            }
            else if(r==2){
                result[i]="Silver Medal";
            }
            else if(r==3){
                result[i] = "Bronze Medal";
            }
            else{
                result[i] = String.valueOf(r);
            }
        }

    return result;
    }
}
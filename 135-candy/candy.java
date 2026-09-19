class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int up = 0;
        int down = 0;
        int peak = 0;
        int sum = 1;

        for(int i=1;i<n;i++){
            if(ratings[i-1]<ratings[i]){
                down = 0;
                up++;
                peak = up;
                sum+=(up+1);
            }
            else if(ratings[i]==ratings[i-1]){
                up=0;
                down=0;
                peak = 0;
                sum+=1;
            }
            else{
                up=0;
                down++;
                sum += down + (down > peak ? 1 : 0);
            }
        }

        return sum;
    }
}
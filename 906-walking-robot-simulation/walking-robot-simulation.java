class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obs = new HashSet<>();
        for(int[] obstacle : obstacles){
            obs.add(obstacle[0] + "," + obstacle[1]);
        }

        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

        int dirIdx = 0;
        int x=0,y=0;
        int maxDistSq = 0;

        for(int command : commands){
            if(command == -1){
                dirIdx = (dirIdx + 1) % 4;
            }else if(command == -2){
                dirIdx = (dirIdx + 3) % 4;
            }
            else{
                int dx = directions[dirIdx][0];
                int dy = directions[dirIdx][1];

                int steps = 0;

                while(steps < command){
                    int nextx = x + dx;
                    int nexty = y + dy;
                
                    if(obs.contains(nextx + "," + nexty)){
                        break;
                    }
                x = nextx;
                y = nexty;

                    maxDistSq = Math.max(maxDistSq,x*x+y*y);
                    steps++;
                }
            }
        }
        return maxDistSq;
    }
}
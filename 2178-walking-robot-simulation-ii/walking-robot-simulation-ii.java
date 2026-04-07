class Robot {
    int w, h, x = 0, y = 0, d = 0;
    int[][] m = {{1,0},{0,1},{-1,0},{0,-1}};
    String[] dir = {"East","North","West","South"};
    int cycle;

    public Robot(int width, int height) {
        w = width; h = height;
        cycle = 2 * (w + h - 2);
    }

    public void step(int n) {
        n %= cycle;
        if (n == 0) n = cycle;

        while (n > 0) {
            int nx = x + m[d][0], ny = y + m[d][1];

            if (nx < 0 || nx >= w || ny < 0 || ny >= h) {
                d = (d + 1) % 4;
            } else {
                x = nx; y = ny;
                n--;
            }
        }
    }

    public int[] getPos() {
        return new int[]{x, y};
    }

    public String getDir() {
        return dir[d];
    }
}
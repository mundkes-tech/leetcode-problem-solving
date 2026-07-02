class Solution {

    class State {
        int row, col, health;

        State(int row, int col, int health) {
            this.row = row;
            this.col = col;
            this.health = health;
        }
    }

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        int n = grid.size();
        int m = grid.get(0).size();

        int[][] best = new int[n][m];
        for (int[] row : best) {
            Arrays.fill(row, -1);
        }

        Queue<State> q = new LinkedList<>();

        health -= grid.get(0).get(0);
        if (health <= 0) return false;

        q.offer(new State(0, 0, health));
        best[0][0] = health;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            State cur = q.poll();

            if (cur.row == n - 1 && cur.col == m - 1) {
                return true;
            }

            for (int i = 0; i < 4; i++) {

                int nr = cur.row + dr[i];
                int nc = cur.col + dc[i];

                if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
                    continue;
                }

                int remaining = cur.health - grid.get(nr).get(nc);

                if (remaining > 0 && remaining > best[nr][nc]) {
                    best[nr][nc] = remaining;
                    q.offer(new State(nr, nc, remaining));
                }
            }
        }

        return false;
    }
}
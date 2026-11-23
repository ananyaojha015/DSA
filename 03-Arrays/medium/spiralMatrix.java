import java.util.*;

class Solution {

    // Brute / Baseline
    public List<Integer> spiralBrute(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[][] visited = new boolean[m][n];

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int i = 0;
        int j = 0;
        int dir = 0;

        for (int count = 0; count < m * n; count++) {

            ans.add(matrix[i][j]);
            visited[i][j] = true;

            int ni = i + dr[dir];
            int nj = j + dc[dir];

            if (ni < 0 || ni >= m || nj < 0 || nj >= n
                    || visited[ni][nj]) {

                dir = (dir + 1) % 4;

                ni = i + dr[dir];
                nj = j + dc[dir];
            }

            i = ni;
            j = nj;
        }

        return ans;
    }

    // Optimal
    public List<Integer> spiralOptimal(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int j = left; j <= right; j++) {
                ans.add(matrix[top][j]);
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Solution obj = new Solution();

        System.out.println("Brute: " + obj.spiralBrute(matrix));
        System.out.println("Optimal: " + obj.spiralOptimal(matrix));
    }
}
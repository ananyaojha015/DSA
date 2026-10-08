class Solution {

    // Brute Approach
    public int pascalBrute(int r, int c) {

        int[][] pascal = new int[r][r];

        for (int i = 0; i < r; i++) {

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                }
                else {
                    pascal[i][j] =
                        pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }

        return pascal[r - 1][c - 1];
    }


    // Better Approach
    public int pascalBetter(int r, int c) {

        int[] old = {1};

        for (int row = 2; row <= r; row++) {

            int[] newp = new int[row];

            newp[0] = 1;
            newp[row - 1] = 1;

            for (int j = 1; j < row - 1; j++) {
                newp[j] = old[j - 1] + old[j];
            }

            old = newp;
        }

        return old[c - 1];
    }


    // Optimal Approach
    public int pascalOptimal(int r, int c) {

        int n = r - 1;
        int k = c - 1;

        // Use symmetry: C(n,k) = C(n,n-k)
        k = Math.min(k, n - k);

        long result = 1;

        for (int i = 1; i <= k; i++) {
            result = result * (n - k + i) / i;
        }

        return (int) result;
    }


    public static void main(String[] args) {

        int r = 5;
        int c = 3;

        Solution obj = new Solution();

        System.out.println("Brute: " + obj.pascalBrute(r, c));
        System.out.println("Better: " + obj.pascalBetter(r, c));
        System.out.println("Optimal: " + obj.pascalOptimal(r, c));
    }
}
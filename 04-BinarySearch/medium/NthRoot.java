
class Solution {
    public int NthRoot(int N, int M) {

        int low = 1;
        int high = M;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long ans = 1;

            for (int i = 0; i < N; i++) {

                ans = ans * mid;

                if (ans > M) {
                    break;
                }
            }

            if (ans == M) {
                return mid;
            }
            else if (ans < M) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}

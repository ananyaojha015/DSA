class Solution {

    // 1. Brute Force: Rotate one position k times
    public void rotateBrute(int[] nums, int k) {
        k = k % nums.length;

        for(int i = 0; i < k; i++) {
            int first = nums[0];

            for(int j = 0; j < nums.length - 1; j++) {
                nums[j] = nums[j + 1];
            }

            nums[nums.length - 1] = first;
        }
    }

    // 2. Better: Using extra array
    public void rotateBetter(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[(i - k + n) % n] = nums[i];
        }

        for(int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }

    // 3. Optimal: Reversal Algorithm
    public void rotateOptimal(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3, 4, 5};
        sol.rotateBrute(nums1, 2);

        for(int x : nums1)
            System.out.print(x + " ");

        System.out.println();

        int[] nums2 = {1, 2, 3, 4, 5};
        sol.rotateBetter(nums2, 2);

        for(int x : nums2)
            System.out.print(x + " ");

        System.out.println();

        int[] nums3 = {1, 2, 3, 4, 5};
        sol.rotateOptimal(nums3, 2);

        for(int x : nums3)
            System.out.print(x + " ");
    }
}
class Solution {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }

        int expected = n * (n + 1) / 2;

        return expected - sum;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {1, 3, 6, 4, 2, 5};

        int answer = sol.missingNumber(nums);

        System.out.println("Missing number: " + answer);
    }
}
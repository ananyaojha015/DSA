class Solution {

    public int largest(int[] nums) {

        int n = nums.length;
        int largest = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[largest]) {
                largest = i;
            }
        }

        return nums[largest];
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {7, 2, 9, 4, 1};

        int answer = sol.largest(nums);

        System.out.println(answer);
    }
}
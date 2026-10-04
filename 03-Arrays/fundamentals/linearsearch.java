class Solution {

    public int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {10, 20, 30, 40, 50};
        int target = 30;

        int answer = sol.linearSearch(nums, target);

        System.out.println(answer);
    }
}
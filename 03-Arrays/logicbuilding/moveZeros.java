class Solution {

    public void moveZeros(int[] nums) {

        int j = 0;

        // Move all non-zero elements to the front
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill remaining positions with zero
        for(int k = j; k < nums.length; k++) {
            nums[k] = 0;
        }
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {0, 1, 0, 3, 12};

        sol.moveZeros(nums);

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
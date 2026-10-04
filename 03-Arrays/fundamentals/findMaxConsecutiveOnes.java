class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int c = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            }
            else {
                count = 0;
            }

            if(c < count) {
                c = count;
            }
        }

        return c;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        int[] nums3 = {0, 0, 0};
        int[] nums4 = {1, 1, 1, 1};

        System.out.println(sol.findMaxConsecutiveOnes(nums1));
        System.out.println(sol.findMaxConsecutiveOnes(nums2));
        System.out.println(sol.findMaxConsecutiveOnes(nums3));
        System.out.println(sol.findMaxConsecutiveOnes(nums4));
    }
}
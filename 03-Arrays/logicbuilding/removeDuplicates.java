class Solution {

    public int removeDuplicates(int[] nums) {

        int j = 0;

        for(int i = 1; i < nums.length; i++) {

            if(nums[j] != nums[i]) {
                nums[j + 1] = nums[i];
                j++;
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {0, 0, 3, 3, 5, 6};

        int k = sol.removeDuplicates(nums);

        System.out.println("Unique elements: " + k);

        System.out.print("Array: ");

        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
class Solution {

    public int secondLargestElement(int[] nums) {
        
        int largest = Integer.MIN_VALUE;
        int secondl = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] > largest) {
                secondl = largest;
                largest = nums[i];
            }
            else if(nums[i] > secondl && nums[i] < largest) {
                secondl = nums[i];
            }
        }

        if(secondl == Integer.MIN_VALUE) {
            return -1;
        }
        else {
            return secondl;
        }
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums1 = {8, 8, 7, 6, 5};
        int[] nums2 = {10, 10, 10, 10, 10};
        int[] nums3 = {5, 2, 9, 7};

        System.out.println(sol.secondLargestElement(nums1));
        System.out.println(sol.secondLargestElement(nums2));
        System.out.println(sol.secondLargestElement(nums3));
    }
}
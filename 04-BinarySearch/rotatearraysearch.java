
class Solution {
    public int rotatearraysearch(int[] nums, int k) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == k) {
                return mid;
            }

            // Check if left half is sorted
            if (nums[low] <= nums[mid]) {

                // Check whether target lies in left half
                if (k >= nums[low] && k < nums[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            // Otherwise, right half is sorted
            else {

                // Check whether target lies in right half
                if (k > nums[mid] && k <= nums[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}

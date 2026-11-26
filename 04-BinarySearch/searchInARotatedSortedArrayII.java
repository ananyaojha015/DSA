
class Solution {
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == k) {
                return true;
            }

            // Handle duplicates
            if (nums[low] == nums[mid] &&
                nums[mid] == nums[high]) {

                low++;
                high--;
                continue;
            }

            // Check if left half is sorted
            if (nums[low] <= nums[mid]) {

                if (k >= nums[low] && k < nums[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            // Right half is sorted
            else {

                if (k > nums[mid] && k <= nums[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}

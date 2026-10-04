import java.util.Arrays;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {

        int arr[] = new int[nums1.length + nums2.length];

        int i = 0, j = 0;
        int k = 0;

        // Both arrays have elements
        while(i < nums1.length && j < nums2.length) {

            if(nums1[i] == nums2[j]) {

                if(k == 0 || arr[k - 1] != nums1[i]) {
                    arr[k] = nums1[i];
                    k++;
                }

                i++;
                j++;
            }

            else if(nums1[i] < nums2[j]) {

                if(k == 0 || arr[k - 1] != nums1[i]) {
                    arr[k] = nums1[i];
                    k++;
                }

                i++;
            }

            else {

                if(k == 0 || arr[k - 1] != nums2[j]) {
                    arr[k] = nums2[j];
                    k++;
                }

                j++;
            }
        }

        // Remaining elements of nums1
        while(i < nums1.length) {

            if(k == 0 || arr[k - 1] != nums1[i]) {
                arr[k] = nums1[i];
                k++;
            }

            i++;
        }

        // Remaining elements of nums2
        while(j < nums2.length) {

            if(k == 0 || arr[k - 1] != nums2[j]) {
                arr[k] = nums2[j];
                k++;
            }

            j++;
        }

        return Arrays.copyOf(arr, k);
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums1 = {3, 4, 4, 4};
        int[] nums2 = {6, 7, 7};

        int[] result = sol.unionArray(nums1, nums2);

        System.out.print("Union: ");

        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}
import java.util.Arrays;

class Solution {

    public int[] intersectionArray(int[] nums1, int[] nums2) {

        int arr[] = new int[nums1.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length) {

            if(nums1[i] == nums2[j]) {

                arr[k] = nums1[i];

                i++;
                j++;
                k++;
            }

            else if(nums1[i] < nums2[j]) {

                i++;
            }

            else {

                j++;
            }
        }

        return Arrays.copyOf(arr, k);
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums1 = {1, 2, 2, 3, 3, 3};
        int[] nums2 = {2, 3, 3, 4, 5, 7};

        int[] result = sol.intersectionArray(nums1, nums2);

        System.out.print("Intersection: ");

        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}
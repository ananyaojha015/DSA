import java.util.*;

class Solution {

    // 1. Brute Force
    public int[] rearrangeArrayBrute(int[] nums) {
        int[] arr = new int[nums.length];
        boolean[] used = new boolean[nums.length];

        for(int i = 0; i < nums.length; i++) {

            if(i % 2 == 0) {
                for(int j = 0; j < nums.length; j++) {
                    if(!used[j] && nums[j] > 0) {
                        arr[i] = nums[j];
                        used[j] = true;
                        break;
                    }
                }
            }
            else {
                for(int j = 0; j < nums.length; j++) {
                    if(!used[j] && nums[j] < 0) {
                        arr[i] = nums[j];
                        used[j] = true;
                        break;
                    }
                }
            }
        }

        return arr;
    }


    // 2. Better - Separate Positive and Negative
    public int[] rearrangeArrayBetter(int[] nums) {
        int[] pos = new int[nums.length];
        int[] neg = new int[nums.length];

        int p = 0;
        int n = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                pos[p] = nums[i];
                p++;
            }
            else {
                neg[n] = nums[i];
                n++;
            }
        }

        p = 0;
        n = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                nums[i] = pos[p];
                p++;
            }
            else {
                nums[i] = neg[n];
                n++;
            }
        }

        return nums;
    }


    // 3. Optimal - Two Pointers
    public int[] rearrangeArrayOptimal(int[] nums) {
        int[] arr = new int[nums.length];

        int p = 0;
        int n = 1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                arr[p] = nums[i];
                p += 2;
            }
            else {
                arr[n] = nums[i];
                n += 2;
            }
        }

        return arr;
    }


    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {2, 4, 5, -1, -3, -4};

        System.out.println(
            "Brute: " +
            Arrays.toString(sol.rearrangeArrayBrute(nums))
        );

        System.out.println(
            "Better: " +
            Arrays.toString(sol.rearrangeArrayBetter(nums))
        );

        System.out.println(
            "Optimal: " +
            Arrays.toString(sol.rearrangeArrayOptimal(nums))
        );
    }
}
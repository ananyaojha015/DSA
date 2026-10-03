import java.util.*;

class Solution {

    // 1. Brute Force
    public List<Integer> leadersBrute(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for(int i = nums.length - 1; i >= 0; i--) {
            int flag = 1;

            for(int j = nums.length - 1; j > i; j--) {
                if(nums[j] >= nums[i]) {
                    flag = 0;
                    break;
                }
            }

            if(flag == 1) {
                ans.add(nums[i]);
            }
        }

        Collections.reverse(ans);
        return ans;
    }

    // 2. Better - Suffix Maximum Array
    public List<Integer> leadersBetter(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        int[] rightMax = new int[n];
        rightMax[n - 1] = nums[n - 1];

        for(int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(nums[i + 1], rightMax[i + 1]);
        }

        for(int i = 0; i < n; i++) {
            if(nums[i] > rightMax[i]) {
                ans.add(nums[i]);
            }
        }

        return ans;
    }

    // 3. Optimal - Right-to-Left Maximum
    public List<Integer> leadersOptimal(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 5, 3, 1, 2};

        System.out.println("Brute: " + sol.leadersBrute(nums));
        System.out.println("Better: " + sol.leadersBetter(nums));
        System.out.println("Optimal: " + sol.leadersOptimal(nums));
    }
}
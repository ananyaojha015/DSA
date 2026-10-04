import java.util.HashMap;

class Solution {

    // 1. Brute Force
    public int majorityElementBrute(int[] nums) {

        int count;
        int maxCount = 0;
        int answer = 0;

        for(int i = 0; i < nums.length; i++) {

            count = 0;

            for(int j = 0; j < nums.length; j++) {

                if(nums[j] == nums[i]) {
                    count++;
                }
            }

            if(count > maxCount) {
                maxCount = count;
                answer = nums[i];
            }
        }

        return answer;
    }


    // 2. Better - HashMap
    public int majorityElementHashing(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : nums) {

            map.put(x, map.getOrDefault(x, 0) + 1);

            if(map.get(x) > nums.length / 2) {
                return x;
            }
        }

        return -1;
    }


    // 3. Optimal - Boyer-Moore Voting Algorithm
    public int majorityElementOptimal(int[] nums) {

        int candidate = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            if(count == 0) {
                candidate = nums[i];
            }

            if(nums[i] == candidate) {
                count++;
            }
            else {
                count--;
            }
        }

        return candidate;
    }


    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        System.out.println("Brute Force: "
                + sol.majorityElementBrute(nums));

        System.out.println("Hashing: "
                + sol.majorityElementHashing(nums));

        System.out.println("Boyer-Moore: "
                + sol.majorityElementOptimal(nums));
    }
}
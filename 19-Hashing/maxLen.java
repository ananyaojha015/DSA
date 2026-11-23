
import java.util.*;

class Solution {
    public int maxLen(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxlen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            // Case 1: Subarray starts from index 0
            if (sum == 0) {
                maxlen = i + 1;
            }

            // Case 2: Same prefix sum was seen before
            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                maxlen = Math.max(maxlen, len);
            }

            // Store only the FIRST occurrence
            else {
                map.put(sum, i);
            }
        }

        return maxlen;
    }
}

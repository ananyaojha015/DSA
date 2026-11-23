class Solution {
    public int subarraysWithXorK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int xor = 0;

        // Store empty prefix
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            // Calculate prefix XOR
            xor = xor ^ nums[i];

            // Find required previous XOR
            int rem = xor ^ k;

            // Check if required XOR exists
            if (map.containsKey(rem)) {
                count = count + map.get(rem);
            }

            // Update frequency of current XOR
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
}
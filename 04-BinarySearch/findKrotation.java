
class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
    int low=0; int high=nums.size()-1;
        int min=Integer.MAX_VALUE;
        int m=0;;
        while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(nums.get(low)<=nums.get(high))
                {
                    if(nums.get(low)<min)
                    {
                       m=low; 
                    }
                    break;
                }
                if(nums.get(low)<=nums.get(mid))
                {
                    if(nums.get(low)<min){
                        min=nums.get(low);
                    m=low;}
                    low=mid+1;
                }
                else
                {
                    if(nums.get(mid)<min){
                        min=nums.get(mid);
                    m=mid;}
                    high=mid-1;
                }
            }
        return m;
    }
}
class Solution {
    public int findKRotation(ArrayList<Integer> nums) {

        int low = 0;
        int high = nums.size() - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums.get(mid) > nums.get(high)) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }

        return low;
    }
}


// Problem Link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

class Solution {
    public int findMin(int[] nums) {

        int mini = Integer.MAX_VALUE;

        int low = 0;

        int high = nums.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(nums[low] <= nums[mid]) {

                mini = Math.min(mini , nums[low]);

                low = mid + 1;
            }

            else {

                mini = Math.min(mini , nums[mid]);

                high = mid - 1;
            }
        }

        return mini;
        
    }
}

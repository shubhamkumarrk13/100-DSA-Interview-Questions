// Problem Link : https://leetcode.com/problems/rotate-array/description/

class Solution {

    public void reverse(int[] nums, int left, int right) {

        while(left < right) {

            int temp = nums[left];

            nums[left] = nums[right];

            nums[right] = temp;

            left++;

            right--;
        }
    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        reverse(nums, 0, n - 1);

        reverse(nums, 0, k - 1);

        reverse(nums, k, n - 1);
        
    }
}

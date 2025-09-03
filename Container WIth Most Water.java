// Problem Link : https://leetcode.com/problems/container-with-most-water/description/

class Solution {

    public int maxArea(int[] height) {

        int maxArea = Integer.MIN_VALUE;

        int left = 0;

        int right = height.length - 1;

        while(left < right) {

            int mini = Math.min(height[left], height[right]);

            int distance = right - left;

            int area = distance * mini;

            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]) left++;

            else right--;
        }

        return maxArea;
        
    }
}

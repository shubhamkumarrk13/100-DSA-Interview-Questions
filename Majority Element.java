// Problem Link : https://leetcode.com/problems/majority-element/description/

class Solution {

    public int majorityElement(int[] nums) {

        int n = nums.length;

        int ele = -1;

        int cnt = 0;

        for(int i=0 ; i<n ; i++) {

            if(cnt == 0) {

                ele = nums[i];

                cnt++;
            }

            else if(nums[i] == ele) cnt++;

            else cnt--;
        }

        cnt = 0;

        for(int i=0 ; i<n ; i++) {

            if(nums[i] == ele) cnt++;
        }

        if(cnt > n/2) return ele;

        return -1;
        
    }
}

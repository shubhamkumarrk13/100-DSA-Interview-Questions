// Problem Link : https://leetcode.com/problems/3sum/description/

class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public void twoSum(int[] nums, int target, int left, int right) {

        while(left < right) {

            int sum = nums[left] + nums[right];

            if(sum > target) right--;

            else if(sum < target) left++;

            else {

                while(left < right && nums[left] == nums[left + 1]) left++;

                while(left < right && nums[right] == nums[right - 1]) right--;

                List<Integer> list = new ArrayList<>();

                list.add(-target);

                list.add(nums[left]);

                list.add(nums[right]);

                result.add(list);

                left++;

                right--;
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        Arrays.sort(nums);

        for(int i=0; i<n; i++) {

            if(i > 0 && nums[i] == nums[i-1]) continue;

            twoSum(nums, -nums[i], i+1, n-1);
        }

        return result;
        
    }
}


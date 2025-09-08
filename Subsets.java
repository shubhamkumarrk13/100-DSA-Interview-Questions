// Problem Link : https://leetcode.com/problems/subsets/description/

class Solution {

    public void solve(int[] nums, int ind, List<Integer> temp, List<List<Integer>> result) {

        if(ind == nums.length) {

            result.add(new ArrayList<>(temp));

            return;
        }

        temp.add(nums[ind]);

        solve(nums, ind + 1, temp, result);

        temp.remove(temp.size() - 1);

        solve(nums, ind + 1, temp, result);
    }


    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        int ind = 0;

        solve(nums, ind, temp, result);

        return result;
        
    }
}

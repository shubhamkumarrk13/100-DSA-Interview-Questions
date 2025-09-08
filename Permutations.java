// Problem Link : https://leetcode.com/problems/permutations/

class Solution {

    public void solve(int[] nums, List<Integer> temp, List<List<Integer>> result) {

        if(temp.size() == nums.length) {

            result.add(new ArrayList<>(temp));

            return;
        }

        for(int i=0; i<nums.length; i++) {

            if(!temp.contains(nums[i])) {

            temp.add(nums[i]);

            solve(nums, temp, result);

            temp.remove(temp.size() - 1);  

            }            
        }

    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        solve(nums, temp, result);

        return result;
        
    }
}

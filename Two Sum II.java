// Problem Link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int left = 0;

        int right = numbers.length - 1;

        int[] result = new int[2];

        while(left < right) {

            int sum = numbers[left] + numbers[right];

            if(sum == target) {

                result[0] = left + 1;

                result[1] = right + 1;

                break;
            }

            else if (sum > target) right--;

            else left++;
        }

        return result;
    }
}

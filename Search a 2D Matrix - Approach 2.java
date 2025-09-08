// Problem Link : https://leetcode.com/problems/search-a-2d-matrix/

class Solution {

    public boolean check(int[] arr, int target) {

        int low = 0;

        int high = arr.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] == target) return true;

            else if(arr[mid] > target) high = mid - 1;

            else low = mid + 1;
        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;

        int col = matrix[0].length;

        int low = 0;

        int high = row - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(matrix[mid][0] <= target && target <= matrix[mid][col - 1]) return check(matrix[mid], target);

            else if(target < matrix[mid][0]) high = mid - 1;

            else if(target > matrix[mid][col - 1]) low = mid + 1;
        }

        return false;
        
    }
}

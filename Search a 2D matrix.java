// Problem Link : https://leetcode.com/problems/search-a-2d-matrix/description/

class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;

        int col = matrix[0].length;

        for(int i=0; i<row; i++) {

            int low = 0;

            int high = col - 1;

            while(low <= high) {

                int mid = low + (high - low) / 2;

                if(matrix[i][mid] == target) return true;

                else if(matrix[i][mid] > target) high = mid - 1;

                else low = mid + 1;
            }
        }

        return false;
        
    }
}

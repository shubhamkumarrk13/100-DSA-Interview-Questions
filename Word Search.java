// Problem Link : https://leetcode.com/problems/word-search/description/

class Solution {

    int m;

    int n;

    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; 

    public boolean find(char[][] board, String word, int i, int j, int ind) {

        if(ind == word.length()) return true;

        if(i<0 || i>=m || j<0 || j>=n || board[i][j] == '$') return false;

        if(board[i][j] != word.charAt(ind)) return false;

        char temp = board[i][j];

        board[i][j] = '$';

        for(int[] dir : directions) {

            int new_i = i + dir[0];

            int new_j = j + dir[1];

            if(find(board, word, new_i, new_j, ind + 1)) return true;
        }

        board[i][j] = temp;

        return false;
    }

    public boolean exist(char[][] board, String word) {

        m = board.length;

        n = board[0].length;

        for(int i=0; i<m ; i++) {

            for(int j=0; j<n; j++) {

                if(board[i][j] == word.charAt(0) && find(board, word, i, j, 0)) return true;
            }
        }

        return false;
        
    }
}

package com.leetcode;

/**
 * @author rajuraghuwanshi
 */
class WordSearch {


    static final int[] h = {-1, 0, 1, 0};
    static final int[] v = {0, 1, 0, -1};

    static boolean isValid(int cur_row, int cur_col, int row, int col) {

        return cur_row >= 0 && cur_row < row && cur_col >= 0 && cur_col < col;

    }

    static boolean dfsUtil(char[][] board, int cur_row, int cur_col, String word, int cur_index) {

        if (cur_index == word.length()) {
            return true;
        }

        if (!isValid(cur_row, cur_col, board.length, board[0].length)) {
            return false;
        }

        if (board[cur_row][cur_col] != word.charAt(cur_index) || board[cur_row][cur_col] == '*') {
            return false;
        }

        char temp = board[cur_row][cur_col];
        board[cur_row][cur_col] = '*';

        for (int i = 0; i < 4; i++) {

            if (dfsUtil(board, cur_row + h[i], cur_col + v[i], word, cur_index + 1)) {
                return true;
            }
        }

        board[cur_row][cur_col] = temp;
        return false;
    }

    public boolean exist(char[][] board, String word) {

        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (word.charAt(0) == board[i][j] && dfsUtil(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
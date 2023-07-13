package org.leetcode.solutions.Valid_Sudoku;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            Set<Character> characterSetHorizontal = new HashSet<>();
            Set<Character> characterSetVertical = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char charHorizontal = board[i][j];
                char charVertical = board[j][i];

                if (charHorizontal != '.' && !characterSetHorizontal.add(charHorizontal)
                        || charVertical != '.' && !characterSetVertical.add(charVertical))
                    return false;
            }
        }

        for (int p = 0; p < 3; p++) {
            for (int q = 0; q < 3; q++) {
                Set<Character> characterSetHorizontal = new HashSet<>();
                Set<Character> characterSetVertical = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char charHorizontal = board[3 * p + i][3 * q + j];
                        char charVertical = board[3 * p + j][3 * q + i];

                        if (charHorizontal != '.' && !characterSetHorizontal.add(charHorizontal)
                                || charVertical != '.' && !characterSetVertical.add(charVertical))
                            return false;
                    }
                }
            }
        }

        return true;
    }


}

package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1 && checkHorisontalCondition(board, index) && checkVerticalCondition (board, index)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkHorisontalCondition (int[][] board, int row) {
        for (int index = 0; index < board.length; index++) {
            if (board[index][row] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkVerticalCondition (int[][] board, int cell) {
        for (int index = 0; index < board.length; index++) {
            if (board[cell][index] != 1) {
                return false;
            }
        }
        return true;
    }
}

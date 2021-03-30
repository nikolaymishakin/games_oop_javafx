package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
                if (board[i][i] == 1 && (monoHorizontal(board, i) || monoVertical(board, i))) {
                    rsl = true;
                    break;
                }
            }
        return rsl;
    }

    private static boolean monoVertical(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][row] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean monoHorizontal(int[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[column][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}

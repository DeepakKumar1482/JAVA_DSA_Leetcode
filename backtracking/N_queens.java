package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N_queens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solveNQueens(n);
    }

    public static void solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        boolean[] cols = new boolean[n];
        boolean[] ndig = new boolean[2 * n - 1];
        boolean[] rdig = new boolean[2 * n - 1];
        String asf = "";
        helper(board, 0, cols, ndig, rdig, asf);
    }
    public static void helper(boolean board[][], int row, boolean cols[], boolean[] ndig, boolean[] rdig, String asf) {
        if (row == board.length) {
            System.out.println(asf);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (cols[col] == false && ndig[row + col] == false && rdig[row - col + board.length - 1] == false) {
                board[row][col] = true;
                cols[col] = true;
                ndig[row + col] = true;
                rdig[row - col + board.length - 1] = true;
                helper(board, row + 1, cols, ndig, rdig, asf + row + col + "-");
                board[row][col] = false;
                cols[col] = false;
                ndig[row + col] = false;
                rdig[row - col + board.length - 1] = false;
            }
        }
    }
}

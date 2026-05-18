package BackTracking;
import java.util.*;
import java.util.ArrayList;

public class NQueens {
    public boolean isSafe(int row, int col, char[][] board) {

        //horizontal
        for(int j=0; j<board.length; j++) {
            if(board[row][j] == 'Q') {
                return false; //it's not safe for a new Queen because old Queen already exists
            }
        }

        //vertical 
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //upper left 
        int r = row; //r is the iterator
        
        for(int c=col; c>=0 && r>=0; c--, r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //upper right

        r = row;
        
        for(int c=col; c< board.length && r>=0; r--, c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //lower left

        r = row;
        
        for(int c=col; c>=0 && r<board.length; r++, c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //lower right

        for(int c=col; c<board.length && r< board.length; c++, r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        return true; //if all the above aren't correct then this return statement works
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i=0; i<board.length; i++) {
            row = "";

            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 'Q') {
                    row += 'Q';
                }
                else{
                    row += '.';
                }
            }
            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if(col == board.length) { //when col = n
            saveBoard(board, allBoards); //configuration of boards stored in all boards
            return;
        }

        for(int row=0; row<board.length; row++) {
            if(isSafe(row, col, board)) {
                board[row][col] = 'Q'; //placing the queen in a particular column
                helper(board, allBoards, col+1);
                board[row][col] = '.'; //removing queen if solution gets incorrect
            }
        }
    }

    public List<List<String>> solveQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String args[]) {
        NQueens sol = new NQueens();
        
        int n = 4;
        List<List<String>> result = sol.solveQueens(n);

        for(List<String> board : result) {
            for(String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}

package OOP_HW;

/*
Eyup Barlas - Erasmus+ Student - Object Oriented Programming Class
Assignment 1 - Sudoku Game
*/

public class SudokuGame {
    // Constants
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {
        // Initiating the board
        int[][] board = {
                {8,6,0,0,2,0,0,0,0},
                {0,0,0,7,0,0,0,5,9},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,6,0,8,0,0},
                {0,4,0,0,0,0,0,0,0},
                {0,0,5,3,0,0,0,0,7},
                {0,0,0,0,0,0,0,0,0},
                {0,2,0,0,0,0,6,0,0},
                {0,0,7,5,0,9,0,0,0}
        };

        System.out.println("Unsolved Board\n**************");
        printBoard(board);

        if (solveBoard(board)){
            System.out.println("\nBoard solved successfully.\n**************************");
        }
        else{
            System.out.println("Board is unsolvable");
        }

        printBoard(board); // solved board
    }

    /**
     * Printing out the solved board
     * @param board  game board
     * @return a nested array contains solved sudoku board
     */
    private static void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++){
            if (row % 3 == 0 && row != 0)
                System.out.println("-----------");
            for (int column = 0; column < GRID_SIZE; column++){
                if (column % 3 == 0 && column != 0)
                    System.out.print("|");
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }

    /**
     * Checking if number is in the current row
     * @param board  game board
     * @param number  number we want to check if exists
     * @param row  current row
     * @return boolean value tells if number is in the row
     */
    private static boolean isNumberInRow(int[][] board, int number, int row){
        for (int i = 0; i < GRID_SIZE; i++){
            if (board[row][i] == number){
                return true;
            }
        }
        return false;
    }

    /**
     * Checking if number is in the current column
     * @param board  game board
     * @param number  number we want to check if exists
     * @param column  current column
     * @return boolean value tells if number is in the column
     */
    private static boolean isNumberInColumn(int[][] board, int number, int column){
        for (int i = 0; i < GRID_SIZE; i++){
            if (board[i][column] == number){
                return true;
            }
        }
        return false;
    }

    /**
     * Checking if number is in the current box
     * @param board  game board
     * @param number  number we want to check if exists
     * @param row  current row
     * @param column  current column
     * @return boolean value tells if number is in the box
     */
    private static boolean isNumberInBox(int[][] board, int number, int row, int column){
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int i = localBoxRow; i < localBoxRow; i++){
            for (int j = localBoxColumn; j < localBoxColumn; j++){
                if (board[i][j] == number){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checking all the methods above
     * @param board  game board
     * @param number  number we want to check if exists
     * @param row  current row
     * @param column  current column
     * @return boolean value tells if number is in the valid position
     */
    private static boolean isValidPlacement(int[][] board, int number, int row, int column){
        return !isNumberInRow(board, number, row) && !isNumberInColumn(board, number, column) && !isNumberInBox(board, number, row, column);
    }

    /**
     * Solving the board using backtracking algorithm
     * @param board  game board
     * @return boolean value tells if the board is solved by the backtracking algorithm
     */
    private static boolean solveBoard(int[][] board){
        for (int row = 0; row < GRID_SIZE; row++){
            for (int column = 0; column < GRID_SIZE; column++){
                if (board[row][column] == 0){
                    for (int testNum = 1; testNum <= GRID_SIZE; testNum++){
                        if (isValidPlacement(board, testNum, row, column)){
                            board[row][column] = testNum;

                            if (solveBoard(board))
                                return true;
                            else
                                board[row][column] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

}

package Backtracking;

public class nquene {
    public static void main(String[] args) {
        int n=5;
        boolean[][] board =new boolean[n][n];
        System.out.println(queens(board, 0));
    }
    static int queens(boolean[][] board, int row){
        if(row==board.length){
            display(board);
            System.out.print("\n");
            return 1;
        }
        int count =0;

        for(int col= 0; col < board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col]= false;
            }
        }

        return count;
    }
    public static boolean isSafe(boolean[][] board, int row, int col){
        // to check vertical row
        for(int i=0; i<row; i++){
            if(board[i][col]){
                return false;
            }
        }

        // to check diagonal left
        int maxleft = Math.min(row,col);
        for(int i =1; i<=maxleft; i++){
            if(board[row-1][col-1]){
                return false;
            }
        }

        // to check diagonal right
        int maxright = Math.min(row, board.length-col-1);
        for(int i =1; i<=maxright; i++){
            if(board[row-1][col+1]){
                return false;
            }
        }

        return true;
    }

    public static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element : row){
                if (element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.print("\n");
        }
    }
}

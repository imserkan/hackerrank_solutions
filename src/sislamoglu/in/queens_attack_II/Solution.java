package sislamoglu.in.queens_attack_II;

import java.util.ArrayList;
import java.util.List;

// TODO: currently not solved, it will be solved.
public class Solution {

    int[][] currentBoard;
    int entityRow;
    int entityColumn;
    List<Integer> obstacleRowList = new ArrayList<>();
    List<Integer> obstacleColumnList = new ArrayList<>();


    public Solution(int n){
        currentBoard = createBoard(n);
    }

    public void setEntityPosition(int row, int column){
        this.entityRow = row;
        this.entityColumn = column;
    }

    public static void main(String[] args) {
        Solution solution = new Solution(5);
        solution.setEntityPosition(4, 3);
        solution.setPossibleEntityMovements();
        solution.addObstaclePosition(3, 4);
    }

    public void addObstaclePosition(int row, int column){
        obstacleRowList.add(row);
        obstacleColumnList.add(column);
    }

    public int[][] createBoard(int n){
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = 0;
            }
        }
        return board;
    }

    public void setPossibleEntityMovements(){
        for (int i = 0; i< currentBoard.length; i++){
            if (currentBoard[entityRow-1][i] != -1){
                currentBoard[entityRow-1][i] = 1;
            }
        }
        for (int i = 0; i < currentBoard.length; i++){
            if (currentBoard[i][entityColumn-1] != -1){
                currentBoard[i][entityColumn-1] = 1;
            }

        }

        for (int i = 0; i < currentBoard.length; i++){
            for (int j = 0; j< currentBoard.length; j++){
                if(i != entityRow-1 && j != entityColumn-1 && currentBoard[i][j] != -1){
                    if (i+j == entityRow+entityColumn-2 || i-j == entityRow-entityColumn){
                        currentBoard[i][j] = 1;
                    }
                }
            }
        }
        printBoard();
    }

    public void printBoard(){
        System.out.println("================================================");
        for (int i = 0; i < currentBoard.length; i++){
            for(int j = 0; j < currentBoard[0].length; j++){
                System.out.print(currentBoard[i][j] + "\t");
            }
            System.out.println();
        }
    }


}

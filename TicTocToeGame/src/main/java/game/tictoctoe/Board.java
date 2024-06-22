package game.tictoctoe;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public  Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingpiece){
        if(board[row][col] != null){
            return false;
        }
        board[row][col] = playingpiece;
        return true;
    }

    public List<Pair<Integer,Integer>> getFreeCells(){
        List<Pair<Integer,Integer>> freeCells = new ArrayList<>();
        for(int i =0 ;i<size;i++){
            for(int j = 0 ; j < size;j++){
                if(board[i][j] == null){
                    Pair<Integer,Integer> rowColumn = new Pair<>(i,j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){
        for(int i =0 ; i< size;i++){
            for(int j =0;j<size;j++){
                if(board[i][j] == null){
                    System.out.print(STR."\{board[i][j]}|");
                }
                else{
                    System.out.print(STR."\{board[i][j].pieceType}|");
                }
            }
            System.out.println("");
        }
    }

}

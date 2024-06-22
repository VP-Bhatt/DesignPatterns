package game.tictoctoe;

import javafx.util.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacGame {
    Deque<Player> players;

    Board gameBoard;

    TicTacGame(){
        initializeGame();
    }
    public String initializeGame(){
        players = new LinkedList<>();
        PlayingPieceX pieceX = new PlayingPieceX();
        PlayingPieceO pieceO = new PlayingPieceO();
        Player player1 = new Player("player1",pieceO);
        Player player2 = new Player("player2", pieceX);
        players.add(player2);
        players.add(player1);

        gameBoard = new Board(3);
        return StartGame();

    }
    public String StartGame(){
        boolean noWinner = true;
        while(noWinner){

            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();
            List<Pair<Integer,Integer>> freeSpaces = gameBoard.getFreeCells();
            if(freeSpaces.isEmpty()){
               noWinner = false;
               continue;

            }
            System.out.print("Player:" + playerTurn.name + "Enter row and column");
            Scanner inputScanner  = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values  = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputCol,playerTurn.playingPiece);
            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect position Try Again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow,inputCol, playerTurn.playingPiece.pieceType);
            if(winner){
                return playerTurn.name;
            }
        }
        return "tie";
    }


    public boolean isThereWinner(int inputRow, int inputCol, PieceType pieceType){
        boolean rowmatch = true;
        boolean colmatch = true;
        boolean diagonalmatch = true;
        boolean antidiagonalmatch = true;

        for(int i=0;i< gameBoard.size;i++){
            for (int j = 0; j< gameBoard.size;j++){
                if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                    rowmatch = false;
                    break;
                }
            }
        }
        for(int i=0;i< gameBoard.size;i++){
            for (int j = 0; j< gameBoard.size;j++){
                if (gameBoard.board[j][i] == null || gameBoard.board[j][i].pieceType != pieceType) {
                    colmatch = false;
                    break;
                }
            }
        }
        for(int i=0,j=0; i< gameBoard.size;i++,j++){
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalmatch = false;
                break;
            }
        }
        for(int i=0,j= gameBoard.size-1; i< gameBoard.size;i++,j--){
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antidiagonalmatch = false;
                break;
            }
        }

        if(rowmatch && colmatch && diagonalmatch && antidiagonalmatch){
            return true;
        }
        return false;

    }




}

package game.tictoctoe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TicTacGame ticTacGame = new TicTacGame();
        System.out.println("game winner is :" + ticTacGame.StartGame());

    }
}
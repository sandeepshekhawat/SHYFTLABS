import chess.*;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Alice", Color.WHITE);
        Player player2 = new Player("Bob", Color.BLACK);

        ChessGame game = new ChessGame(player1, player2);
        game.startGame();
    }
}

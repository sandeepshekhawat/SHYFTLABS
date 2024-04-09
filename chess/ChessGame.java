package chess;

public class ChessGame {
    private Board board;
    private Player[] players;
    private Player currentPlayer;

    public ChessGame(Player player1, Player player2) {
        this.board = new Board();
        this.players = new Player[] { player1, player2 };
        this.currentPlayer = player1; 
    }

    public void startGame() {
        //logic
    }
}

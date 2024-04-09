package chess;

public class Board {
    private Square[][] squares;

    public Board() {
        this.squares = new Square[8][8];
    }

    public Square getSquare(int row, int col) {
        return squares[row][col];
    }
}

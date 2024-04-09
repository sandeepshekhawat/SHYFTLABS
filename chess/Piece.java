package chess;

public abstract class Piece {
    private Color color;
    private Square currentSquare;

    public Piece(Color color, Square startingSquare) {
        this.color = color;
        this.currentSquare = startingSquare;
    }

    public Color getColor() {
        return color;
    }

    public Square getCurrentSquare() {
        return currentSquare;
    }

    public void setCurrentSquare(Square square) {
        this.currentSquare = square;
    }

    public abstract boolean isValidMove(Board board, Square start, Square end);
}

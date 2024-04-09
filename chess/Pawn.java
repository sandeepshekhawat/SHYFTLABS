package chess;

public class Pawn extends Piece {
    public Pawn(Color color, Square startingSquare) {
        super(color, startingSquare);
    }

    @Override
    public boolean isValidMove(Board board, Square start, Square end) {
    
        return false;
    }
}

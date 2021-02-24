package game;

import game.boardException.IllegalMove;
import game.boardException.IllegalPosition;

/**
 * Mother class for all pieces of chessboard
 * @author Axel gouchon
 */

public abstract class Piece {
    protected ChessBoard board;
    protected Coord place;
    protected Color col;

    /**
     * Getter
     * @return place;
     */
    public Coord getPlace() { return place; }
    /**
     * 
     * @return board;
     */
    public ChessBoard getBoard() { return board; }
    /**
     * 
     * @return col;
     */
    public Color getCol() { return col; }

    protected abstract void move(Coord c) throws IllegalMove, IllegalPosition;
}


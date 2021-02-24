package game.chessPiece;

import game.ChessBoard;
import game.Color;
import game.Coord;
import game.Piece;
import game.boardException.IllegalMove;
import game.boardException.IllegalPosition;

/**
 * class Tower
 * A piece of chess : tower
 * @author Axel goucho
 * the fast
 */

public class Tower extends Piece {
	/**
	 * class ChessBoard
	 */
    public ChessBoard board;
    /**
     * enum Color
     */
    public Color col;
    /**
     * class Coord
     */
    public Coord place;

    /*
     * Getters
     * enum Color
     * @return col
     */
    public Color getCol() {
        return col;
    }
    /**
     * class Coord
     * @return place
     */
    public Coord getPlace() {
        return place;
    }
    /**
     * class ChessBoard
     * @return board
     */
    public ChessBoard getBoard() {
        return board;
    }

    /**
     *
     * @param place corresponds of the position's piece
     * @param col corresponds of tge color's piece
     * @param board corresponds of the board with de pieces
     */

    public Tower(Coord place, Color col, ChessBoard board) {
        this.place = place;
        this.col = col;
        this.board = board;
        this.board.setOccupation(this.place, true);
    }

    /**
     *
     * @param c corresponds to the new desired position.
     * @throws IllegalPosition except an exception when the piece is out of matrix
     * @throws IllegalMove except an exception when  the piece make a move out of this capacity.
     */
    public void move(Coord c) throws IllegalPosition, IllegalMove {

        if (((c.getX() != place.getX())&&(c.getY() == place.getY()))||((c.getX() == place.getX())&&(c.getY() != place.getY()))){
            if (c.getX() < 8 && c.getX() >= 0 && c.getY() < 8 && c.getY() >= 0 && !getBoard().isOccupied(c)) {
                this.board.setOccupation(this.place, false);
                this.place = c;
                this.board.setOccupation(c, true);
            } else {
                throw new IllegalMove("Illegal move for the Tower");
            }
        } else {
            throw new IllegalPosition("The Tower is out of range");
        }

    }

    public String toString(){
        return board.toString();
    }
}

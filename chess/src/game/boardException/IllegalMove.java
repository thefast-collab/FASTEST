package game.boardException;
import game.Coord;

/**
 * Called when the user move out a legal position of piece
 * Public Class IllegalMove
 */

public class IllegalMove extends Exception {
	/**
	 * Public method illegal move
	 * @param message
	 * The fast
	 */
	public IllegalMove(String message){ super (message); };
}

package game;

/**
 * 
 * @author Axel Gouchon
 *
 */
public class Coord {
    private int x;
    private int y;

    /**
     *
     * @param x represent the x value coordinate in matrix
     * @param y represent the y value coordinate in matrix
     */

    public Coord(int x, int y) {
        this.x = x - 1;
        this.y = y - 1;
    }

    /**
     * 
     * @return X
     */
    public int getX() {
        return x;
    }
    /**
     * 
     * 
     * @return Y
     */
    public int getY() {
        return y;
    }
}

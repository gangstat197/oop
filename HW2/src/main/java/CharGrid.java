// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
        this.grid = new char[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                this.grid[i][j] = grid[i][j];
            }
        }
	}

	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == ch) {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        int width = maxX - minX + 1;
        int height = maxY - minY + 1;
        return width * height;
	}


    /**
     * @param x
     * @param y
     * @param dirX
     * @param dirY
     * @return length of that direction
     */
    public int dirCount(int x, int y, int dirX, int dirY) {
        int count = 0;

        int centerValue = grid[x][y];

        x += dirX;
        y += dirY;

        while (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length) {

            if (grid[x][y] == centerValue) {
                count++;
            } else {
                return count;
            }

            x += dirX;
            y += dirY;
        }

        return count;
    }

    /**
     * Returns the count of '+' figures in the grid (see handout).
     * @return number of + in grid
     */
	public int countPlus() {
        int result = 0;
        for (int i = 0; i <= grid.length - 1; i++) {
            for (int j = 0; j <= grid[0].length - 1; j++) {
                int up = dirCount(i, j, 1, 0);
                int down = dirCount(i, j, -1, 0);
                int left = dirCount(i, j, 0, -1);
                int right = dirCount(i, j, 0, 1);

                if (up == down && left == right && left == down) {
                    result++;
                }
            }
        }
        return result; // YOUR CODE HERE
    }
}

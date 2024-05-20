public class GridPath
{
    /** Initialized in the constructor with distinct values that never change */
    private int[][] grid;

    /**
    * Returns the Location representing a neighbor of the grid element at row and col,
    * as described in part (a)
    * Preconditions: row is a valid row index and col is a valid column index in grid.
    * row and col do not specify the element in the last row and last column of grid.
    */
    public Location getNextLoc(int row, int col)
    {
        int below = Integer.MAX_INT;
        int right = Integer.MAX_INT;

        if (row < grid.length()) {
            int below = grid[row + 1][col];
        }

        if (col < grid[row].length()) {
            int right = grid[row][col + 1];
        }
        
        if (below < right) {
            row += 1;
        }
        else  {
            col += 1
        }

        return new Location(row, col);
    }

    /**
    * Computes and returns the sum of all values on a path through grid, as described in
    * part (b)
    * Preconditions: row is a valid row index and col is a valid column index in grid.
    * row and col do not specify the element in the last row and last column of grid.
    */
    public int sumPath(int row, int col)
    {
        int endRow = grid.length() - 1;
        int endCol = grid[0].length() - 1;
        int sum = 0;

        while (row < endRow || col < endCol) {
            sum += grid[row][col];

            Location next = getNextLoc(row, col);
            row = next.getRow();
            col = next.getCol();
        }

        return sum;
    }
}
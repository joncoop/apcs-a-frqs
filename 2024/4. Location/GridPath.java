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
        Location rightLoc = new Location(row, col + 1);
        Location belowLoc = new Location(row + 1, col);

        boolean atBottom = row < grid.length - 1;
        boolean atRight = row < grid[0].length - 1;

        if (atBottom) {
            return rightLoc;
        }
        else if (atRight) {
            return belowLoc;
        }
            
        int belowValue = grid[row + 1][col];
        int rightValue =  grid[row][col + 1];
        
        if (belowValue < rightValue) {
            return belowLoc;
        }
        else {
            return rightLoc;
        }
    }

    /**
    * Computes and returns the sum of all values on a path through grid, as described in
    * part (b)
    * Preconditions: row is a valid row index and col is a valid column index in grid.
    * row and col do not specify the element in the last row and last column of grid.
    */
    public int sumPath(int row, int col)
    {
        int endRow = grid.length - 1;
        int endCol = grid[0].length - 1;
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

public class Data
{
    public static final int MAX = 1000; // value not given in problem
    private int[][] grid;
    
    public void repopulate() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                int r = 0; // any value that gets into the loop once works here
                
                while (r % 100 == 0) {
                    r = 10 * (int)(MAX / 10 * Math.random() + 1);
                }
                
                grid[row][col] = r;
            }
        }
    }
    
    public int countIncreasingCols() {
        int count = 0;
        
        for (int col = 0; col < grid[0].length; col++) {
            boolean increasing = true;
            
            for (int row = 1; row < grid.length; row++) {
                if (grid[row][col] < grid[row - 1][col]) {
                    increasing = false;
                    break; // makes code slightly more efficient, but break is not in AP Java subset
                }
            }
            
            if (increasing) {
                count++;
            }
        }
        
        return count;
    }
}

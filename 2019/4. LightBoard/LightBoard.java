public class LightBoard
{
    /** The lights on the board, where true represents on and false represents off.
    */
    private boolean[][] lights;

    /** Constructs a LightBoard object having numRows rows and numCols columns.
    *   Precondition: numRows > 0, numCols > 0
    *   Postcondition: each light has a 40% probability of being set to on.
    */
    public LightBoard(int numRows, int numCols)
    {
        lights = new boolean[numRows][numCols];

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                double p = Math.random();

                lights[r][c] = p < 0.40;
            }
        }
    }

    public void setLights(boolean[][] statuses) {
        lights = statuses;
    }

    /** Evaluates a light in row index row and column index col and returns a status
    *   as described in part (b).
    *   Precondition: row and col are valid indexes in lights.
    */
    public boolean evaluateLight(int row, int col)
    {
        int numOnInColumn = 0;

        for (int r = 0; r < lights.length; r++) {
            if (lights[r][col]) {
                numOnInColumn++;
            }
        }

        boolean isOn = lights[row][col];
        boolean isEven = numOnInColumn % 2;
        boolean isDivBy3 = numOnInColumn % 3;

        if (isOn && isEven) {
            return false;
        }
        
        if (!isOn && isDivBy3) {
            return true;
        }

        return isOn;
    }

    public String toString() {
        String result = "";
        int onCount = 0;
        int totalCount = 0;

        for (int r = 0; r < lights.length; r++) {
            for (int c = 0; c < lights[r].length; c++) {
                boolean status = lights[r][c];
                result += status + "\t";

                if (status) {
                    onCount++;
                }
                totalCount++;
            }
            result += "\n";
        }

        double p = (double)onCount / totalCount;
        result += "Percent on: " + p;

        return result;
    }

}

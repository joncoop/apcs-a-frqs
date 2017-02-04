
public class TreasureMap {

	private boolean myGrid[][];
	
	public TreasureMap(boolean myGrid[][]) {
		
		this.myGrid = myGrid;
	}
	
	public int getNumRows() {
		return myGrid.length;
	}
	
	public int getNumCols() {
		return myGrid[0].length; // return length of any row because grid is rectangular
	}
	
	public boolean hasTreasure(int row, int col) {
		
		if (row >= 0 && row < getNumRows() && col >= 0 && col < getNumCols())
			return myGrid[row][col];
		
		return false;
	}
	
	public int getNumAdjacent(int row, int col) {
		
		int count = 0;
		
		for (int r=row-1; r<=row+1; r++) {
			for (int c=col-1; c<=col+1; c++) {
				if ((c != col || r != row) && hasTreasure(r, c)) {  // be sure to call hasTreasure and not reference myGrid
					count++;
				}
			}
		}
		
		return count;
	}
}

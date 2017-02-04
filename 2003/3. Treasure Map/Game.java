
public class Game {
	
	private TreasureMap map;
	
	// not shown
	public Game() {
		
	}
	
	// not shown
	public void setMap(TreasureMap map) {
		this.map = map;
	}
	
	public int[][] computeCounts() {
	
		int rows = map.getNumRows();
		int cols = map.getNumCols();
		
		int[][] result = new int[rows][cols];
		
		for (int r=0; r<rows; r++) {
			for (int c=0; c<cols; c++) {
				
				
				if (map.hasTreasure(r, c)) {
					result[r][c] = 9;
				}
				else {
					result[r][c] = map.getNumAdjacent(r, c);
				}
				
			}
		}
		
		return result;
	}
	
}

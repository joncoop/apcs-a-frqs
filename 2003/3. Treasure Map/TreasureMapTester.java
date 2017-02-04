
public class TreasureMapTester {
	
	public static void main(String[] args) {
		
		boolean[][] grid = {{false, true,  true,  false, true,  false, true,  false , false},
                            {false, true,  false, false, false, false, true,  false,  false},
		                    {false, true,  false, true,  true,  false, false, true,   true },
		                    {true,  false, true,  false, true,  true,  false, false,  false},
		                    {false, true,  false, false, true,  false, false, true,   false},
		                    {true,  false, false, true,  false, true,  false, false,  false}};
		
		
		TreasureMap theMap = new TreasureMap(grid);
		
		System.out.println(theMap.getNumRows());
		System.out.println(theMap.getNumCols());
		System.out.println();
		
		System.out.println(theMap.hasTreasure(0, 2));
		System.out.println(theMap.hasTreasure(0, -1));
		System.out.println(theMap.hasTreasure(2, 3));
		System.out.println(theMap.hasTreasure(2, 2));
		System.out.println(theMap.hasTreasure(4, 9));
		System.out.println();
		
		System.out.println(theMap.getNumAdjacent(3, 3));
		System.out.println(theMap.getNumAdjacent(2, 4));
		System.out.println(theMap.getNumAdjacent(4, 7));
		System.out.println();
		
		
		boolean[][] grid2 = {{false, true,  false, true,  true},
				             {true,  false, false, false, false},
				             {false, true,  true,  false, false}};
				
		TreasureMap aMap = new TreasureMap(grid2);
		
		Game game = new Game();
		game.setMap(aMap);
		
		int[][] counts = game.computeCounts();
		
		int rows = counts.length;
		int cols = counts[0].length;
		
		for (int r=0; r<rows; r++) {
			for (int c=0; c<cols; c++) {
				System.out.print(counts[r][c] + " ");
			}
			System.out.println();
		}
		
	}
}

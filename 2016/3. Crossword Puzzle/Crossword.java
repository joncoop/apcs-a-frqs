
public class Crossword {

	private Square[][] puzzle;
	
	public Crossword(boolean[][] blackSquares) {
		puzzle = new Square[rows][cols];
		int label = 1;
		
		for (int r = 0; r < blackSquares.length; r++) {
			for (int  c= 0; c < blackSquares[0].length; c++) {
				boolean isBlack = blackSquares[r][c];
				boolean toLabel = toBeLabeled(r, c, blackSquares);
				int num;
				
				if (toLabel) {
					num = label;
					label++;
				}
				else {
					num = 0;
				}
				
				puzzle[r][c] = new Square(isBlack, num);
			}
		}
	}
	
	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
		
		boolean black = blackSquares[r][c];
		boolean blockedAbove = r == 0 || blackSquares[r-1][c];
		boolean blockedRight = c == 0 || blackSquares[r][c-1];
		
		return !black && (blockedAbove || blockedRight);
	}
	
	public String toString() {
		String result = "CrosswordPuzzle:\n";
		
		for (int r = 0; r < puzzle.length; r++) {
			result += "  ";
			
			for (int c = 0; c < puzzle[r].length; c++) {
				result += puzzle[r][c] + " ";
			}
			
			result += "\n";
		}
		
		return result.trim();
	}
}

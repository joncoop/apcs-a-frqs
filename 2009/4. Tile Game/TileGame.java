import java.util.ArrayList;


public class TileGame {

	private ArrayList<NumberTile> board;
	
	public TileGame() {
		this.board = new ArrayList<NumberTile>();
	}
	
	private int getIndexForFit(NumberTile tile) {
		
		if (board.size() == 0) {
			return 0;
		}
		
		if (tile.getRight() == board.get(0).getLeft()) {
			return 0;
		}
		
		for (int i=0; i<board.size()-1; i++) {
			int before = board.get(i).getRight();
			int after = board.get(i+1).getLeft();
			
			int left = tile.getLeft();
			int right = tile.getRight();
			
			if (before == left && right == after) {
				return i + 1;
			}
		}
	
		if (tile.getLeft() == board.get(board.size()-1).getRight()) {
			return board.size();
		}

		return -1;
	}
	
	public boolean insertTile(NumberTile tile) {
				
		for (int i=0; i<4; i++) {
			int location = getIndexForFit(tile);
			
			if (location >= 0) {
				board.add(location, tile);
				return true;
			}
			
			tile.rotate();
		}
		
		return false;
	}
	
	public String toString() {
		String result = "TileGame:\n";
		
		for (NumberTile t : board) {
			result += "  " + t + "\n";
		}
		
		return result.trim();
	}
}

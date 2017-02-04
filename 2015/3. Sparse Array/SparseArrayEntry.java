
public class SparseArrayEntry {

	private int row;
	private int col;
	private int value;
	
	public SparseArrayEntry(int row, int col, int value) {
		this.row = row;
		this.col = col;
		this.value = value;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public int getValue() {
		return value;
	}

	public String toString() {
		return "SparseArrayEntry [row=" + row + ", col=" + col + ", value=" + value + "]";
	}
	
	
}

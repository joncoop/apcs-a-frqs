import java.util.ArrayList;
import java.util.List;


public class SparseArray {

	private int numRows;
	private int numCols;
	private List<SparseArrayEntry> entries;
	
	public SparseArray() {
		entries = new ArrayList<SparseArrayEntry>();
	}
	
	public void insert(SparseArrayEntry entry) {
		entries.add(entry);
	}
	
	public void setDimensions(int numRows, int numCols) {
		this.numRows = numRows;
		this.numCols = numCols;
	}	
	
	public int getNumRows() {
		return numRows;
	}
	
	public int getValueAt(int row, int col) {
		
		for (SparseArrayEntry e: entries) {
			int r = e.getRow();
			int c = e.getCol();
			
			if (r == row && c == col) {
				return e.getValue();
			}
		}
		
		return 0;
	}
	
	public void removeColumn(int col) {
		
		for (int i=entries.size() - 1; i>=0; i--) {
			
			SparseArrayEntry e = entries.get(i);
			
			int c = e.getCol();
			int r = e.getRow();
			int v = e.getValue();

			if (c == col) {
				entries.remove(i);
			}
			else if (c > col) {
				SparseArrayEntry fixed = new SparseArrayEntry(r, c - 1, v);
				entries.set(i, fixed);
			}
		}
		
		numCols -= 1;
	}
	
	public String toString() {
		String result = "SparseArray (" + numRows + ", " + numCols + "):\n";
		
		for (SparseArrayEntry e: entries) {
			result += "  " + e + "\n";
		}
		
		return result.trim();
	}
}


public class SkyView {

	private double[][] view;
	
	public SkyView(int numRows, int numCols, double[] scanned) {
		
		view = new double[numRows][numCols];
		
		int i = 0;
		
		for (int r=0; r<numRows; r++) {
			for (int c=0; c<numCols; c++) {
				
				if (r%2 == 0) {
					view[r][c] = scanned[i];
				}
				else {
					view[r][numCols - c - 1] = scanned[i];
				}
				
				i++;
			}
		}
	}
	
	public double getAverage(int startRow, int endRow, int startCol, int endCol) {
		 
		double sum = 0.0;
		int cells = (endRow - startRow + 1) * (endCol - startCol + 1);
				
		for (int r=startRow; r<=endRow; r++) {
			for (int c=startCol; c<=endCol; c++) {
				sum += view[r][c];
			}
		}
		
		return sum / cells;
	}
	
	public String toString() {
		String result = "Skyview:\n";
		
		for (int r=0; r<view.length; r++) {
			
			result += "  ";
			
			for (int c=0; c<view[r].length; c++) {
				result += view[r][c] + "\t";
			}
			
			result += "\n";
		}
		
		return result.trim();
	}
}

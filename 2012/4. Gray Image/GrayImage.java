
public class GrayImage {

	public static final int BLACK = 0;
	public static final int WHITE = 255;
	
	private int[][] pixelValues;
	
	public GrayImage(int[][] pixelValues) {
		this.pixelValues = pixelValues;
	}
	
	public int countWhitePixels() {
		
		int count = 0;
		
		for (int r=0; r<pixelValues.length; r++) {
			for (int c=0; c<pixelValues[r].length; c++) {
				
				if (pixelValues[r][c] == WHITE) {
					count++;
				}
				
			}
		}
		
		return count;
	}
	
	public void processImage() {
		int rows = pixelValues.length;
		int cols = pixelValues[0].length;
		
		for (int r=0; r<rows-2; r++) {
			for (int c=0; c<cols-2; c++) {
				
				pixelValues[r][c] -= pixelValues[r+2][c+2];
					
				if (pixelValues[r][c] < BLACK) {
					pixelValues[r][c] = BLACK;
				}
			}
		}
	}
	
	public String toString() {
		String result = "GrayImage:\n";
		
		for (int r=0; r<pixelValues.length; r++) {
			for (int c=0; c<pixelValues[r].length; c++) {
				
				result += "  " + pixelValues[r][c] + "\t";
				
			}
			
			result += "\n";
		}
		
		return result.trim();
	}

}

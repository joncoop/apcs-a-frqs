
public class RouteCipher {

	int numRows;
	int numCols;
	String[][] letterBlock;
	
	public RouteCipher(int numRows, int numCols) {
		this.numRows = numRows;
		this.numCols = numCols;
		
		letterBlock = new String[numRows][numCols];
	}
	
	public void fillBlock(String str) {
		int strIndex = 0;
		
		for (int r=0; r<numRows; r++) {
			for (int c=0; c<numCols; c++) {
				
				String letter = "A";
				
				if (strIndex < str.length()) {
					letter = str.substring(strIndex, strIndex + 1);
					strIndex++;
				}
				
				letterBlock[r][c] = letter;
			}
		}
	}
	
	public String encryptBlock(){
		String encrypted = "";
		
		for (int c=0; c<numCols; c++) {
			for (int r=0; r<numRows; r++) {
				encrypted += letterBlock[r][c];
			}
		}
		
		return encrypted;
	}
	
	public String encryptMessage(String message) {
		String encrypted = "";
		int blockSize = numRows * numCols;
		
		for (int i=0; i<message.length(); i+=blockSize) {
			String part = message.substring(i);
			fillBlock(part);
			encrypted += encryptBlock();
		}
		
		return encrypted;
	}


	//alternate solution
	/* 
	public String encryptMessage(String message) {
		String answer = "";
		int size = numRows * numCols;
		
		while (message.length() > 0) {
			fillBlock(message);
			answer += encryptBlock();
			
			if (message.length() > size) {
				message = message.substring(size);
			}
			else {
				message = "";
			}
		}
		
		return answer;
	}
	*/
	
}

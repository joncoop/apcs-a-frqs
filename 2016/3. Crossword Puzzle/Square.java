
public class Square {

	private boolean isBlack;
	private int num;
	
	public Square(boolean isBlack, int num) {
		this.isBlack = isBlack;
		this.num = num;
	}
	
	public String toString() {
		String result;
		
		if (isBlack) {
			result = "##";
		}
		else if (num > 0){
			result = String.format("%02d", num);
		}
		else {
			result = "  "; 
		}
		
		return result;
	}
}

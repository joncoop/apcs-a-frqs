
public class NumberTile {

	private int top;
	private int right;
	private int bottom;
	private int left;
	
	public NumberTile(int top, int right, int bottom, int left) {
		this.top = top;
		this.right = right;
		this.bottom = bottom;
		this.left = left;
	}

	public void rotate() {
		int temp = top;
		
		top = left;
		left = bottom;
		bottom = right;
		right = temp;
	}
	
	public int getLeft() {
		return left;
	}
	
	public int getRight() {
		return right;
	}
	
	public String toString() {
		return "NumberTile [top=" + top + ", right=" + right + ", bottom="
				+ bottom + ", left=" + left + "]";
	}
}

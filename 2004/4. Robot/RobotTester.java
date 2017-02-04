import java.util.Arrays;

public class RobotTester {

	public static void main(String[] args) {
		
		int[] items = {1, 1, 2, 2};
		
		Robot pr2004 = new Robot(items, 1, true);
		
		int moves = 0;
		System.out.println(Arrays.toString(pr2004.getHall()));	

		moves = pr2004.clearHall();
		
		System.out.println(Arrays.toString(pr2004.getHall()));	
		System.out.println(moves);	

	}

}

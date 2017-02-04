import java.util.Arrays;


public class NumberCubeTester {

	public static int[] getCubeTosses(NumberCube cube, int numTosses) {
		
		int[] result = new int[numTosses];
		
		for (int i=0; i<numTosses; i++) {
			result[i] = cube.toss();
		}
		
		return result;
	}
	
	public static int getLongestRun(int[] values) {
		
		int longest = 0;
		int run = 1;
		
		for (int i=0; i<values.length-1; i++) {
			int current = values[i];
			int next = values[i+1];
			
			if (current == next) {
				run += 1;
			}
			else if (run > longest) {
				longest = run;
				run = 1;
			}
		}
		
		return longest;
	}
	
	public static void main(String[] args) {
		
		NumberCube cube = new NumberCube();
		int[] test = getCubeTosses(cube, 10);
		System.out.println(Arrays.toString(test));
		
		int[] sample = {1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5, 5};
		System.out.println(getLongestRun(sample));
	}

}

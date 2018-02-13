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

		int start = -1;
		int longest = 0;
		int run = 0;

		for (int i=0; i<values.length; i++) {
			if (i < values.length-1 && values[i] == values[i+1]) {
				run += 1;
			}
			else {
				if (run > longest) {
					longest = run;
					start = i - run;
				}

				run = 0;
			}
		}

		return start;
	}

	public static void main(String[] args) {

		NumberCube cube = new NumberCube();
		int[] test = getCubeTosses(cube, 10);
		System.out.println(Arrays.toString(test));

		int[] sample = {1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5, 5};
		//int[] sample = {1, 5, 5, 4, 3, 1, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5, 5, 5};
		//int[] sample = {5, 5, 5, 5, 1, 2, 3, 3, 3};
		//int[] sample = {1, 2, 3, 4, 5};
		System.out.println(getLongestRun(sample));
	}

}

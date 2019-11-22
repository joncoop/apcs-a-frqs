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

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i+1]) {
                run += 1;
                
                if (run > longest) {
                    longest = run;
                    start = i - run + 1;
                }
            }
            else {
                run = 0;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        NumberCube cube = new NumberCube();
        int[] tosses = getCubeTosses(cube, 10);
        System.out.println(Arrays.toString(tosses));
        System.out.println(getLongestRun(tosses));
           
        int[] test = {1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5, 5};
        //int[] test = {1, 5, 5, 4, 3, 1, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5, 5, 5};
        //int[] test = {5, 5, 5, 5, 1, 2, 3, 3, 3};
        //int[] test = {1, 2, 3, 4, 5};
        System.out.println(getLongestRun(test));
    }
    
}

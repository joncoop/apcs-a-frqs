import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int[][] arr2D = { { 0, 1, 2 }, 
                          { 3, 4, 5 },
                          { 6, 7, 8 },
                          { 9, 5, 3 } };
                          
        int[] result = ArrayTester.getColumn(arr2D, 1);
        System.out.println( Arrays.toString(result) );
        
        int[][] latin1 = { { 1, 2, 3 }, 
                           { 2, 3, 1 },
                           { 3, 1, 2 } };
                          
        int[][] latin2 = { { 10, 30, 20,  0 }, 
                           {  0, 20, 30, 10 }, 
                           { 30,  0, 10, 20 },
                           { 20, 10,  0, 30 } };
                          
        int[][] not1 = { { 1, 2, 1 }, 
                         { 2, 1, 1 },
                         { 1, 1, 2 } };
                          
        int[][] not2 = { { 1, 2, 3 }, 
                         { 3, 1, 2 },
                         { 7, 8, 9 } };
                          
        int[][] not3 = { { 1, 2 }, 
                         { 1, 2 } };
                          
        
        System.out.println( ArrayTester.isLatin(latin1) );
        System.out.println( ArrayTester.isLatin(latin2) );
        System.out.println( ArrayTester.isLatin(not1) );
        System.out.println( ArrayTester.isLatin(not2) );
        System.out.println( ArrayTester.isLatin(not3) );
    }
}

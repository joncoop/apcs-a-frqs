import java.util.*;
public class Question4_Runner
{
	public static void main(String[] args)
   {
   	int[][] aplus = {{0,9,0,9},{1,1,1},{2,2,2},{2,0,2},{0,0,0}};
   	System.out.println( Arrays.deepToString( aplus ) ); 
   	System.out.println( ArrayResizer.numNonZeroRows( aplus ) );
   	int[][] wow = ArrayResizer.resize( aplus );
   	System.out.println( Arrays.deepToString( wow ) );    	  		  		
	}
}

/*
[[0, 9, 0, 9], [1, 1, 1], [2, 2, 2], [2, 0, 2], [0, 0, 0]]
2
[[1, 1, 1], [2, 2, 2]]
*/
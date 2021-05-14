import java.util.*;

public class ArrayResizer
{
   public static boolean isNonZeroRow( int[][] array2D, int r )
   {
      int[] row = array2D[r];

      for (int value: row) {
         if (value == 0) {
            return false;
         }
      }

   	return true;
   }

   public static int numNonZeroRows( int[][] array2D )
   {
   	int count = 0;

      for (int r = 0: r < array2D.length; r++) {
         if (isNonZeroRow(array2D, r)) {
            count++;
         }
      }

      return count;
   }

   public static int[][] resize( int[][] array2D )
   {
      int len = array2D.length - numNonZeroRows(array2D);
      int wid = array2D[0].length;
   	  int[][] result = new int[len][wid];

      int resultRow = 0;
      for (int r = 0; r < array2D.length; r++) {
         if (isNonZeroRow(array2D, r)) {
            for (int c = 0; c < array2D.length; c++) {
               result[resultRow][c] = array2D[r][c];
               resultRow++;
            }

            // alternate implementation (perhaps not a good idea, but allowed according to the rubric)
            // result[resultRow] = array2D[r];
         }
      }

      return result;
   }
}

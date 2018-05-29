public class ArrayTester
{
    public static int[] getColumn(int[][] arr2D, int c) {
        int numRows = arr2D.length;
        int[] result = new int[numRows];
        
        for (int r=0; r<numRows; r++) {
            result[r] = arr2D[r][c];
        }
        
        return result;
    }
    
    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        for (int a: arr1) {
            boolean found = false;
            
            for (int b: arr2) {
                if (a == b) {
                    found = true;
                }
            }
            
            if (!found) {
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean containsDuplicates(int[] arr) {
        for (int i=0; i<arr.length - 1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static boolean isLatin(int[][] square) {
        int[] first = square[0];
        
        if (containsDuplicates(first)) {
            return false;
        }
        
        for (int n=0; n<square.length; n++) {
            int[] row = square[n];
            int[] col = getColumn(square, n);
            
            if (!hasAllValues(first, row) || !hasAllValues(first, col)) {
                return false;
            }
        }
        
        return true;
    }
}

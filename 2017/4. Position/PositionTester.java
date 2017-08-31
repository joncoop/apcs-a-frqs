public class PositionTester {
    
    public static Position findPosition(int num, int[][] intArr) {
        int rows = intArr.length;
        int cols = intArr[0].length;
        
        for (int r=0; r<rows; r++) {
            for (int c=0; c<cols; c++) {
                if (intArr[r][c] == num) {
                    return new Position(r, c);
                }
            }
        }
            
        return null;
    }
    
    public static Position[][] getSuccessorArray(int[][] intArr) {
        int rows = intArr.length;
        int cols = intArr[0].length;
        
        Position[][] successors = new Position[rows][cols];
        
        for (int r=0; r<rows; r++) {
            for (int c=0; c<cols; c++) {
                int val = intArr[r][c] + 1;
                successors[r][c] = findPosition(val, intArr);
            }
        }
        
        return successors;
    }
    
    public static void main(String[] args) {
        int[][] arr = {{15,  5,  9, 10},
                       {12, 16, 11,  6},
                       {14,  8, 13,  7}};
                         
        System.out.println(findPosition(8, arr));
        System.out.println(findPosition(17, arr));
        
        Position[][] successorArr = getSuccessorArray(arr);
        
        for (int r=0; r<successorArr.length; r++) {
            for (int c=0; c<successorArr[r].length; c++) {
                System.out.print(successorArr[r][c] + "\t");
            }
            System.out.println();
        }
        
    }
}

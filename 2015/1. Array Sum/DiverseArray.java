import java.util.Arrays;


public class DiverseArray {

	public static int arraySum(int[] arr) {
		
		int sum = 0;
		
		for (int n : arr) {
			sum += n;
		}
		
		return sum;
	}
	
	public static int[] rowSums(int[][] arr2D) {
	
		int sums[] = new int[arr2D.length];
		
		for (int i = 0; i <arr2D.length; i++) {
			sums[i] = arraySum(arr2D[i]);
		}
		
		return sums;
	}
	
	public static boolean isDiverse(int[][] arr2D) {
		
		int[] sums = rowSums(arr2D);
		
		for(int i=0; i<sums.length - 1; i++) {
			for (int j=i+1; j<sums.length; j++) {
				if (sums[i] == sums[j]) {
					return false;
				}
			}
		
		}
		
		return true;
	}
	
	public static void main(String[] args) {
	
		int[] arr1 = {1, 3, 2, 7, 3};
		System.out.println(arraySum(arr1));
		
		int[][] mat1 = {{ 1,  3, 2, 7, 3},
				{10, 10, 4, 6, 2},
			      	{ 5,  3, 5, 9, 6},
				{ 7,  6, 4, 2, 1}};
		
		int[] sums = rowSums(mat1);
		System.out.println(Arrays.toString(sums));

		int[][] mat2 = {{ 1,  1,  5, 3, 4},
			        {12,  7,  6, 1, 9},
				{ 8, 11, 10, 2, 5},
				{ 3,  2,  3, 0, 6}};
		
		System.out.println(isDiverse(mat1));
		System.out.println(isDiverse(mat2));
	}

}

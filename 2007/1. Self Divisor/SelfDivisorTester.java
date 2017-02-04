import java.util.Arrays;

public class SelfDivisorTester {
	
	public static void main(String[] args) {
		
		System.out.println(SelfDivisor.isSelfDivisor(128));
		System.out.println(SelfDivisor.isSelfDivisor(26));
		
		int[] divList = SelfDivisor.firstNumSelfDivisors(10, 3);
		System.out.println(Arrays.toString(divList));
		
	}
	
}


public class RouteCipherTester {

	public static void main(String[] args) {
		String topSecret = "Meet at midnight";
		
		RouteCipher cipher = new RouteCipher(2, 3);
		
		String encrypted = cipher.encryptMessage(topSecret);
		
		System.out.println(encrypted);
	}
}

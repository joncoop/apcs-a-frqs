
public class TokenPassTester {

	public static void main(String[] args) {
		TokenPass game = new TokenPass(4);
		
		System.out.println(game);
		
		game.distributeCurrentPlayerTokens();
		
		System.out.println(game);

	}

}

import java.util.Arrays;


public class TokenPass {

	private int[] board;
	private int currentPlayer;
	
	public TokenPass(int playerCount) {
		board = new int[playerCount];
		
		for (int i=0; i<board.length; i++) {
			board[i] = (int)(10 * Math.random() + 1);
		}
		
		currentPlayer = (int)(playerCount * Math.random());
	}
	
	public void distributeCurrentPlayerTokens() {
		
		int tokens = board[currentPlayer];
		int loc = currentPlayer;
		board[currentPlayer] = 0;
		
		while (tokens > 0) {
			loc = (loc + 1) % board.length;
			
			board[loc]++;
			tokens--;
		}
	}
	
	public String toString() {
		return "TokenPass:\n" + 
	           "  board=" + Arrays.toString(board) + "\n" + 
	           "  turn = " + currentPlayer;
	}
}

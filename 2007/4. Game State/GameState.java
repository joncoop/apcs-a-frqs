import java.util.List;


public interface GameState {

	boolean isGameOver();
	
	Player getWinner();
	
	Player getCurrentPlayer();
	
	List<String> getCurrentMoves();
	
	void makeMove(String move);
	
	String toString();
}

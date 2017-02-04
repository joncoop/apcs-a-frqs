import java.util.List;


public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
	}

	public String getNextMove(GameState state) {
		
		List<String> possibleMoves = state.getCurrentMoves();
		
		int numMoves = possibleMoves.size();
		
		if (numMoves == 0) {
			return "no move";
		}
		
		int rand = (int) (numMoves * Math.random());
		
		return possibleMoves.get(rand);
	}
}


public class GameDriver {

	private GameState state;
	
	public GameDriver(GameState initial) {
		this.state = initial;
	}
	
	public void play() {
		
		System.out.println(state);
		
		while (!state.isGameOver()) {
			
			Player current = state.getCurrentPlayer();
			String name = current.getName();
			String move = current.getNextMove(state);

			System.out.println(name + " "  + move);
			state.makeMove(move);
		}
		
		Player winner = state.getWinner();
		
		if (winner == null) {
			System.out.println("Game ends in a draw");
		}
		else {
			String name = winner.getName();
			System.out.println(name + " wins!");
		}
	}
}

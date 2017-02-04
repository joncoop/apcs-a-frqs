
public class TileGameTester {

	public static void main(String[] args) {
		
		NumberTile tile = new NumberTile(4, 3, 7, 4);
		
		System.out.println(tile);
		tile.rotate();
		System.out.println(tile);
		tile.rotate();
		System.out.println(tile);
		tile.rotate();
		System.out.println(tile);
		tile.rotate();
		System.out.println(tile);
		System.out.println();
		
		
		TileGame game = new TileGame();
		
		NumberTile t0 = new NumberTile(4, 3, 7, 4);
		NumberTile t1 = new NumberTile(6, 4, 3, 3);
		NumberTile t2 = new NumberTile(1, 2, 3, 4);
		NumberTile t3 = new NumberTile(3, 2, 5, 2);
		NumberTile t4 = new NumberTile(5, 9, 2, 2);
		
		game.insertTile(t1);
		game.insertTile(t0);
		game.insertTile(t2);
		game.insertTile(t3);
		game.insertTile(t4);
		
		System.out.println(game);
		System.out.println();

		NumberTile tile1 = new NumberTile(2, 9, 2, 4);
		NumberTile tile2 = new NumberTile(4, 2, 9, 8);
		NumberTile tile3 = new NumberTile(5, 6, 1, 3);
		
		System.out.println( game.insertTile(tile1) );
		System.out.println( game.insertTile(tile2) );
		System.out.println( game.insertTile(tile3) );
		System.out.println();

		System.out.println(game);
	}

}

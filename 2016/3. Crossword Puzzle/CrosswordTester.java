
public class CrosswordTester {

	public static void main(String[] args) {
		
		boolean[][] blackSquares = {{ true, false, false,  true,  true,  true, false, false, false},
				                    {false, false, false, false,  true, false, false, false, false},
				                    {false, false, false, false, false, false,  true,  true,  true},
				                    {false, false,  true, false, false, false,  true, false, false},
				                    { true,  true,  true, false, false, false, false, false, false},
				                    {false, false, false, false,  true, false, false, false, false},
				                    {false, false, false,  true,  true,  true, false, false,  true}};

		Crossword xWord = new Crossword(blackSquares);
		
		System.out.println(xWord);
	}
}

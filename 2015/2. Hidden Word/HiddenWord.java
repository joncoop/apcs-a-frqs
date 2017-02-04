
public class HiddenWord {

	private String word;
	
	public HiddenWord(String word) {
		this.word = word;
	}
	
	public String getHint(String guess) {
		String result = "";
		
		for (int i=0; i<word.length(); i++) {
			String letter = word.substring(i, i+1);
			String guessed = guess.substring(i, i+1);
			
			if (letter.equals(guessed)) {
				result += letter;
			}
			else if (word.indexOf(guessed) >= 0) {
				result += "+";
			}
			else {
				result += "*";
			}	
		}
		
		return result;
	}
}

import java.util.ArrayList;
import java.util.List;


public class RandomStringChooser {


	private List<String> wordList;
	
	public RandomStringChooser(String[] wordArr) {
		
		wordList = new ArrayList<String>();
		
		for (String w: wordArr) {
			wordList.add(w);
		}
	}
	
	public String getNext() {
		
		int numWords = wordList.size();
		
		if (numWords > 0) {
			int r = (int)(numWords * Math.random());
			
			return wordList.remove(r);
		}
		
		return "NONE";
	}

}

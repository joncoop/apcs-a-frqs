import java.util.ArrayList;
import java.util.List;


public class ScrambledWordTester {

	public static String scrambleWord(String word) {
		String result = "";
		
		int pos = 0;
		
		while (pos < word.length() - 1) {
			String letter = word.substring(pos, pos + 1);
			String next = word.substring(pos + 1, pos + 2);
			
			if (letter.equals("A") && !next.equals("A")) {
				result += next + letter;
				pos += 2;
			}
			else {
				result += letter;
				pos += 1;
			}
		}
		
		result += word.substring(pos);

		return result;
	}
	
	public static void scrambleOrRemove(List<String> wordList) {
		
		for (int i=wordList.size()-1; i>=0; i--) {
			String word = wordList.get(i);
			String scrambled = scrambleWord(word);
			
			if (word.equals(scrambled)) {
				wordList.remove(i);
			}
			else {
				wordList.set(i, scrambled);
			}
		}
	}
	
	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();
		words.add("TAN");
		words.add("ABRACADABRA");
		words.add("WHOA");
		words.add("AARDVARK");
		words.add("EGGS");
		words.add("A");
		words.add("");
		
		for (String w: words) {
			System.out.println(scrambleWord(w));
		}
		
		words.remove("AARDVARK");
		words.remove("A");
		words.remove("");
		words.add(3, "APPLE");
		
		System.out.println(words);
		scrambleOrRemove(words);
		System.out.println(words);
		
	}

}

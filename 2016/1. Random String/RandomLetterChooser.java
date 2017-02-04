
public class RandomLetterChooser extends RandomStringChooser {
	
	public RandomLetterChooser(String str) {
		
		super(getSingleLetters(str));
	}
	
	public static String[] getSingleLetters(String str) {
		
		int numLetters = str.length();
		String[] result = new String[numLetters];
		
		for (int i=0; i<numLetters; i++) {
			result[i] = str.substring(i, i+1);
		}
		
		return result;
	}

}

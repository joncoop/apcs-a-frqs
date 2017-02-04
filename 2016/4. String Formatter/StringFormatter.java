import java.util.ArrayList;
import java.util.List;


public class StringFormatter {

	public static int totalLetters(List<String> wordList) {
		
		int count = 0;
		
		for (String w: wordList) {
			count += w.length();
		}
		
		return count;
	}
	
	public static int basicGapWidth(List<String> wordList, int formattedLen) {
	
		int gaps = wordList.size() - 1;
		int extra = formattedLen - totalLetters(wordList);
		
		return extra / gaps;
	}
	
	public static int leftoverSpaces(List<String> wordList, int formattedLen) {
		int numLetters = totalLetters(wordList);
		int numGaps = wordList.size() - 1;
		int gapWidth = basicGapWidth(wordList, formattedLen);
		
		return formattedLen - numLetters - numGaps * gapWidth;
	}
	
	public static String format(List<String> wordList, int formattedLen) {

		String result = "";
		
		int gapWidth = basicGapWidth(wordList, formattedLen);
		int extraSpaces = leftoverSpaces(wordList, formattedLen);
		
		for (int i=0; i<wordList.size() - 1; i++) {
			result += wordList.get(i);
			
			for (int j=0; j<gapWidth; j++) {
				result += " ";
			}
			
			if (i < extraSpaces) { 
				result += " ";
			}
		}
		
		return result + wordList.get(wordList.size() - 1);
	}
	
	public static void main(String[] args) {

		List<String> example1 = new ArrayList<String>();
		example1.add("AP");
		example1.add("COMP");
		example1.add("SCI");
		example1.add("ROCKS");
		
		System.out.println("Total letters = " + totalLetters(example1));
		System.out.println("Basic gap width = " + basicGapWidth(example1, 20));
		System.out.println("Leftover spaces = " + leftoverSpaces(example1, 20));
		
		String formatted1 = format(example1, 20);
		int length1 = formatted1.length();
		System.out.println("Formatted string = " + formatted1 + " (" + length1 + ")");		
		System.out.println();
		
		List<String> example2 = new ArrayList<String>();
		example2.add("GREEN");
		example2.add("EGGS");
		example2.add("AND");
		example2.add("HAM");
		
		System.out.println("Total letters = " + totalLetters(example2));
		System.out.println("Basic gap width = " + basicGapWidth(example2, 20));
		System.out.println("Leftover spaces = " + leftoverSpaces(example2, 20));
		
		String formatted2 = format(example2, 20);
		int length2 = formatted2.length();
		System.out.println("Formatted string = " + formatted2 + " (" + length2 + ")");		
		System.out.println();

		List<String> example3 = new ArrayList<String>();
		example3.add("BEACH");
		example3.add("BALL");

		System.out.println("Total letters = " + totalLetters(example3));
		System.out.println("Basic gap width = " + basicGapWidth(example3, 20));
		System.out.println("Leftover spaces = " + leftoverSpaces(example3, 20));
		
		String formatted3 = format(example3, 20);
		int length3 = formatted3.length();
		System.out.println("Formatted string = " + formatted3 + " (" + length3 + ")");		
		System.out.println();

	}

}

import java.util.ArrayList;


public class StringCoder {

	private String masterString;
	
	public StringCoder(String masterString) {
		this.masterString = masterString;
	}
	
	public String decodeString(ArrayList<StringPart> parts) {
		String result = "";
		
		for (StringPart p: parts) {
			int start = p.getStart();
			int length = p.getLength();
			
			result += masterString.substring(start, start + length);
		}
		
		return result;
	}
	
	public StringPart findPart(String str) {
		
		int len = str.length();
		
		while (len > 0) {
			String beginning = str.substring(0, len);
			
			int loc = masterString.indexOf(beginning);
			
			if (loc > -1) {
				return new StringPart(loc, len);
			}
			
			len -= 1;
		}
		
		return null;
	}
	
	public ArrayList<StringPart> encodeString(String word) {
		
		ArrayList<StringPart> result = new ArrayList<StringPart>();
		
		while (word.length() > 0) {
			StringPart part = findPart(word);
			result.add(part);
			
			word = word.substring(part.getLength());
		}
		
		return result;
	}
}

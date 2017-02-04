
public class SubstringChecker implements Checker {

	private String str;
	
	public SubstringChecker(String str) {
		
		this.str = str;
	}

	public boolean accept(String text) {
		
		return text.indexOf(str) > -1;
	}
	
	
}


public class AndChecker implements Checker {

	private Checker checker1;
	private Checker checker2;
	
	public AndChecker(Checker checker1, Checker checker2) {
		this.checker1 = checker1;
		this.checker2 = checker2;
	}
	
	public boolean accept(String text) {
		return checker1.accept(text) && checker2.accept(text);
	}

}

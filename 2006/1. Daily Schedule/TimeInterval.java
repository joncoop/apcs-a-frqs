
public class TimeInterval {

	private int start;
	private int end;
	
	public TimeInterval(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public boolean overlapsWith(TimeInterval interval) {
		
		int a = this.start;
		int b = this.end;
		int c = interval.start;
		int d = interval.end;
		
		return a >= c && a <= d ||
			   b >= c && b <= d ||
			   c >= a && c <= b ||
			   d >= a && d <= b;
	}
}


public class StudentRecord {

	private int[] scores;
	
	public StudentRecord(int[] scores)
	{
		this.scores = scores;
	}

	private double average(int first, int last)  {
		
		double sum = 0.0;
		int count = last - first + 1;
		
		for (int i=first; i<=last; i++) {
			sum += scores[i];
		}
		
		return sum / count;
	}
	
	private boolean hasImproved() {
				
		for (int i=0; i<scores.length-1; i++) {
			if (scores[i+1] < scores[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public double finalAverage() {
		int first = 0;
		int last = scores.length - 1;
		
		if (hasImproved()) {
			first = scores.length / 2;
		}
		
		return average(first, last);
	}
}

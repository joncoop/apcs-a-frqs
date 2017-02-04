import java.util.ArrayList;

public class StudentAnswerSheet {

	private String name;
	private ArrayList<String> answers;
	
	public StudentAnswerSheet(String name, ArrayList<String> answers) {
		this.name = name;
		this.answers = answers;
	}
	
	public double getScore(ArrayList<String> key) {
		double score = 0;
		
		for (int i=0; i<answers.size(); i++) {
			String answer = answers.get(i);
			String correct = key.get(i);
			
			if (answer.equals(correct)) {
				score += 1;
			}
			else if (answer.equals("?")) {
				score += 0;
			}
			else {
				score -= 0.25;	
			}
		}
		
		return score;
	}
	
	public String getName() {
		return name;
	}
}

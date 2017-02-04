import java.util.ArrayList;

public class TestResults {

	private ArrayList<StudentAnswerSheet> sheets;
	
	public TestResults(ArrayList<StudentAnswerSheet> sheets) {
		this.sheets = sheets;
	}
	
	public String highestScoringStudent(ArrayList<String> key) {
		
		StudentAnswerSheet highStudent = sheets.get(0);
		double highScore = sheets.get(0).getScore(key);
		
		for (StudentAnswerSheet s : sheets) {
			double score = s.getScore(key);
			
			if (score > highScore) {
				highStudent = s;
				highScore = score;
			}
		}
		
		return highStudent.getName();
	}
}

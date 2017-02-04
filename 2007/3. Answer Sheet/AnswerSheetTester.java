import java.util.ArrayList;


public class AnswerSheetTester {

	public static ArrayList<String> convertToArrayList(String str) {
		
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i=0; i<str.length(); i++) {
			result.add(str.substring(i, i+1));
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> key = convertToArrayList("ACDEBCEBBC");
		
		ArrayList<String> ans1 = convertToArrayList("ABDEAC?BDC");
		ArrayList<String> ans2 = convertToArrayList("DCDEBCE??C");
		ArrayList<String> ans3 = convertToArrayList("AC?EBCEBBC");
		ArrayList<String> ans4 = convertToArrayList("ACD?BCE?BC");
		ArrayList<String> ans5 = convertToArrayList("ECDEBCEAB?");
		
		ArrayList<StudentAnswerSheet> answerSheets = new ArrayList<StudentAnswerSheet> ();
		answerSheets.add(new StudentAnswerSheet("Student A", ans1));
		answerSheets.add(new StudentAnswerSheet("Student B", ans2));
		answerSheets.add(new StudentAnswerSheet("Student C", ans3));
		answerSheets.add(new StudentAnswerSheet("Student D", ans4));
		answerSheets.add(new StudentAnswerSheet("Student E", ans5));
		
		for (StudentAnswerSheet sheet: answerSheets) {
			System.out.println(sheet.getName() + ": " + sheet.getScore(key));
		}
		
		TestResults results = new TestResults(answerSheets);
		
		System.out.println("Best: " + results.highestScoringStudent(key));
		
	}
}

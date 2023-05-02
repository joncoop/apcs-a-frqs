import java.util.List;


public class SeatingChart {

	private Student[][] seats;
	
	public SeatingChart(List<Student> studentList, int rows, int cols) {
		
		seats = new Student[rows][cols];
		int i = 0;
		
		for (int c = 0; c < cols; c++) {
			for (int r = 0; r < rows; r++) {
				if (i < studentList.size()) {
					seats[r][c] = studentList.get(i);				
					i++;
				}
			}
		}
		
		/* Alt. solution (1 loop)
		seats = new Student[rows][cols];
		
		for (int i = 0; i < studentList.size(); i++) {
			int r = i % rows;
			int c = i / rows;
			
			seats[r][c] = studentList.get(i);
		}
		*/
	}
	
	public int removeAbsentStudents(int allowedAbsences) {
		
		int count = 0;
		
		for (int r = 0; r < seats.length; r++) {
			for (int c = 0; c<seats[r].length; c++) {
				Student s = seats[r][c];
				
				if (s != null) {
					if (s.getAbsenceCount() > allowedAbsences) {
						seats[r][c] = null;
						count++;
					}
				}
			}
		}
		
		return count;
	}
	
	public String toString() {
		String result = "SeatingChart:\n";
		
		for (int r = 0; r < seats.length; r++) {
			result += "  ";
			
			for (int c = 0; c < seats[r].length; c++) {
				Student s = seats[r][c];
				
				if (s != null) {
					result += s.getName() + " (" + s.getAbsenceCount() + ")\t";
				}
				else {
					result += "null    \t";
				}
			}
			
			result += "\n";
		}
		
		return result.trim();
	}
}

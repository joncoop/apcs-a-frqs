
import java.util.ArrayList;

public class CollegeGroup {
	
	private ArrayList<College> myColleges;
	
	public CollegeGroup() {
		myColleges = new ArrayList<College>();
	}
	
	public CollegeGroup(ArrayList<College> myColleges)
	{
		this.myColleges = myColleges;
	}
	
	public void add(College college) {
		myColleges.add(college);
	}
	
	public void updateTuition(String name, int tuition) {
		for (College c : myColleges) {
			if (c.getName().equals(name))
			{
				c.setTuition(tuition);
			}
		}
	}
	
	public ArrayList<College> getCollegeList() {
		return myColleges;
	}
	
	public ArrayList<College> getCollegeList(String region) {
		ArrayList<College> result = new ArrayList<College>();
		
		for (College c : myColleges) {
			if (c.getRegion().equals(region)) {
				result.add(c);
			}
		}
		
		return result;		
	}
	
	public ArrayList<College> getCollegeList(int low, int high) {
		ArrayList<College> result = new ArrayList<College>();
		
		for (College c : myColleges) {
			if (c.getTuition() >= low && c.getTuition() < high) {
				result.add(c);
			}
		}
		
		return result;
	}
	public ArrayList<College> getCollegeList(String region, int low, int high) {
		ArrayList<College> result = new ArrayList<College>();
		
		for (College c : myColleges) {
			if (c.getRegion().equals(region) && c.getTuition() >= low && c.getTuition() < high) {
				result.add(c);
			}
		}
		
		return result;
	}
}

import java.util.ArrayList;
import java.util.List;


public class ClimbingClub {

	private List<ClimbInfo> climbList;
	
	public ClimbingClub() {
		climbList = new ArrayList<ClimbInfo>();
	}
	
	public void addClimb(String peakName, int climbTime) {
		ClimbInfo climb = new ClimbInfo(peakName, climbTime);
		// Part a: climbList.add(climb);
		
		// Part b:		
		int i = 0;
		while (i < climbList.size() && !added) {

			ClimbInfo c = climbList.get(i);
			String name = c.getName();
			
			if (peakName.compareTo(name) < 0) {
				climbList.add(i, climb);
				return;
			}
			
			i++;
		}
		
		climbList.add(climb);
	}
	
	public int distinctPeakNames() {
		
		// The given code works if peak names are sorted, but not for unsorted.
		// Still, the code was ugly. Here's a nicer implementation:
		
		if (climbList.size() == 0) {
			return 0;
		}
		
		int count = 1;
		
		for (int i=0; i<climbList.size() - 1; i++) {
			String current = climbList.get(i).getName();
			String next = climbList.get(i+1).getName();
			
			if (!current.equals(next)) {
				count++;
			}
		}
		
		return count;
	}
	
	public String toString() {
		
		String result = "ClimbingClub: \n";
		
		for (ClimbInfo c: climbList) {
			result += "  " + c + "\n";
		}
		
		return result.trim();
	}
}

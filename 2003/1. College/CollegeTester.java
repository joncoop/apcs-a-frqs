import java.util.ArrayList;

public class CollegeTester {

	public static void main(String[] args) {
		
		ArrayList<College> colleges = new ArrayList<College>();
		
		colleges.add(new College("Clemson" , "Southeast", 12000));
		colleges.add(new College("South Carolina" , "Southeast", 12000));
		colleges.add(new College("MIT" , "Northeast", 50000));		

		CollegeGroup group = new CollegeGroup(colleges);
		
		group.add(new College("Stanford" , "West", 60000));
		group.add(new College("Oregon" , "Northwest", 14000));
		group.add(new College("Northwestern" , "Midwest", 45000));
		
		
		System.out.println(group.getCollegeList("Southeast", 10000, 15000));

		group.updateTuition("South Carolina", 5000);
		
		System.out.println(group.getCollegeList("Southeast", 10000, 15000));
		
		System.out.println(group.getCollegeList());
		System.out.println(group.getCollegeList("Midwest"));
		System.out.println(group.getCollegeList(40000, 55000));
	}

}

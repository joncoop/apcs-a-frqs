import java.util.ArrayList;
import java.util.List;


public class SeatingChartTester {

	public static void main(String[] args) {
		
		List<Student> roster = new ArrayList<Student>();
		roster.add( new Student("Karen", 3) );
		roster.add( new Student("Liz", 1) );
		roster.add( new Student("Paul", 4) );
		roster.add( new Student("Lester", 1) );
		roster.add( new Student("Henry", 5) );
		roster.add( new Student("Renee", 9) );
		roster.add( new Student("Glen", 2) );
		roster.add( new Student("Fran", 6) );
		roster.add( new Student("David", 1) );
		roster.add( new Student("Danny", 3) );
		
		SeatingChart introCS = new SeatingChart(roster, 3, 4);
		System.out.println(introCS);
		System.out.println();
		
		System.out.println("removed = " + introCS.removeAbsentStudents(4));
		System.out.println();
		
		System.out.println(introCS);
		System.out.println();
		
		System.out.println("Poor David is all alone.");		
	}
}


public class NumberGroupTester {

	public static void main(String[] args) {
		
		NumberGroup range = new Range(-3, 2);
		
		System.out.println( range.contains(0) );
		System.out.println( range.contains(5) );
		System.out.println();
		
		NumberGroup range1 = new Range(5, 8);
		NumberGroup range2 = new Range(10, 12);
		NumberGroup range3 = new Range(1, 6);
		
		MultipleGroups multiple1 = new MultipleGroups();
		multiple1.addGroup(range1);
		multiple1.addGroup(range2);
		multiple1.addGroup(range3);
		
		System.out.println( multiple1.contains(2) );
		System.out.println( multiple1.contains(9) );
		System.out.println( multiple1.contains(6) );
		
	}
}

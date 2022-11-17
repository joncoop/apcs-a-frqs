public class TrailTester {
	
	public static void main(String[] args) {
		int[] elevations = new int[] {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		
		Trail t = new Trail(elevations);

		System.out.println( t.isLevelTrailSegment(7, 10) );
		System.out.println( t.isLevelTrailSegment(2, 12) );

		System.out.println( t.isDifficult() );
	}
	
}

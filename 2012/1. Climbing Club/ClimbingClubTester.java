
public class ClimbingClubTester {

	public static void main(String[] args) {

		ClimbingClub hikerClub = new ClimbingClub();
		
		System.out.println("Distinct peaks = " + hikerClub.distinctPeakNames());

		hikerClub.addClimb("Monadnock",	274);
		hikerClub.addClimb("Whiteface",	301);
		hikerClub.addClimb("Algonquin",	225);
		hikerClub.addClimb("Monadnock",	344);
		
		System.out.println(hikerClub);
		
		System.out.println("Distinct peaks = " + hikerClub.distinctPeakNames());
	}

}

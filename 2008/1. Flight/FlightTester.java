import java.util.ArrayList;
import java.util.List;


public class FlightTester {

	public static void main(String[] args) {

		Time t1 = new Time(13, 0);
		Time t2 = new Time(14, 15);
		
		System.out.println( t1.minutesUntil(t2) );
		System.out.println( t2.minutesUntil(t1) );
		System.out.println();
		
		Time t0d = new Time(11, 30);
		Time t0a = new Time(12, 15);	
		Flight f0 = new Flight(t0d, t0a);
		
		Time t1d = new Time(13, 15);
		Time t1a = new Time(15, 45);	
		Flight f1 = new Flight(t1d, t1a);
		
		Time t2d = new Time(16, 0);
		Time t2a = new Time(18, 45);	
		Flight f2 = new Flight(t2d, t2a);
		
		Time t3d = new Time(20, 15);
		Time t3a = new Time(21, 0);	
		Flight f3 = new Flight(t3d, t3a);
		
		List allFlights = new ArrayList<Flight>();
		allFlights.add(f0);
		allFlights.add(f1);
		allFlights.add(f2);
		allFlights.add(f3);
		
		Trip vacation = new Trip(allFlights);
		
		System.out.println( vacation.getDuration() );
		System.out.println( vacation.getShortestLayover() );
	}

}

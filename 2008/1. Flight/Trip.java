import java.util.List;

public class Trip {

	private List<Flight> flights;
	
	public Trip(List<Flight> flights) {
		this.flights = flights;
	}
	
	public int getDuration() {
		
		int first = 0;
		int last = flights.size() - 1;
		
		Time begin = flights.get(first).getDepartureTime();
		Time end = flights.get(last).getArrivalTime();
		
		return begin.minutesUntil(end);
	}
	
	public int getShortestLayover() {
		
		if (flights.size() < 2) {
			return -1;
		}
		
		int shortest = 24 * 60; // all day (could get layover between first two
		                        // flights here and call that shortest as well)
		
		for (int i=0; i<flights.size() - 1; i++) {
			Time arrive = flights.get(i).getArrivalTime();
			Time depart = flights.get(i + 1).getDepartureTime();
			
			int layover = arrive.minutesUntil(depart);
			
			shortest = Math.min(shortest, layover);
		}
		
		return shortest;
	}

}


public class Time {

	private int hours; // use 24-hour time
	private int minutes;
	
	public Time(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public int minutesUntil(Time other) {
		int minutes1 = 60 * this.hours + this.minutes;
		int minutes2 = 60 * other.hours + other.minutes;
		
		return minutes2 - minutes1;
	}
}


public class Appointment {

	TimeInterval interval;
	
	public Appointment(TimeInterval interval) {
		this.interval = interval;
	}
	
	public TimeInterval getTime() {
		return interval;
	}
	
	public boolean conflictsWith(Appointment other) {
		TimeInterval a = this.getTime();
		TimeInterval b = other.getTime();
		
		return a.overlapsWith(b);
	}
}

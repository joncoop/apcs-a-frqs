
public class ScheduleTester {

	public static void main(String[] args) {
		
		TimeInterval t1 = new TimeInterval(5, 10);
		TimeInterval t2 = new TimeInterval(7, 12);
		TimeInterval t3 = new TimeInterval(3, 12);
		TimeInterval t4 = new TimeInterval(14, 20);
				
		Appointment a1 = new Appointment(t1);
		Appointment a2 = new Appointment(t2);
		Appointment a3 = new Appointment(t3);
		Appointment a4 = new Appointment(t4);

		DailySchedule schedule = new DailySchedule();
		
		System.out.println( schedule.addAppt(a1, false) );
		System.out.println( schedule.addAppt(a2, false) );
		System.out.println( schedule.addAppt(a3, true) );
		System.out.println( schedule.addAppt(a4, false) );
	}
}

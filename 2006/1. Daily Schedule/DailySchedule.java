import java.util.ArrayList;

public class DailySchedule {
	
	private ArrayList<Appointment> apptList;
	
	public DailySchedule() {
		apptList = new ArrayList<Appointment>();
	}
	
	public void clearConflicts(Appointment appt) {
		
		for (int i=apptList.size()-1; i>=0; i--) {
			Appointment existing = apptList.get(i);
			
			if (existing.conflictsWith(appt)) {
				apptList.remove(i);
			}
		}
	}
	
	public boolean addAppt(Appointment appt, boolean emergency) {
		
		if (emergency) {
			clearConflicts(appt);
		}
		else {
			for (Appointment a: apptList) {
				if (a.conflictsWith(appt)) {
					return false;
				}
			}
		}
		
		apptList.add(appt);
		
		return true;
	}
}

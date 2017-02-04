import java.util.ArrayList;
import java.util.Arrays;

public class Hotel {

	public Reservation[] rooms;
	private ArrayList<String> waitList;
	
	public Hotel(int numRooms) {
		this.rooms = new Reservation[numRooms];
		this.waitList = new ArrayList<String>();
	}
	
	public Reservation requestRoom(String guestName) {
		
		for (int i=0; i<rooms.length; i++) {
			if (rooms[i] == null) {
				rooms[i] = new Reservation(guestName, i);
				return rooms[i];
			}
		}
		
		waitList.add(guestName);
		
		return null;
	}
	
	public Reservation cancelAndReassign(Reservation res) {

		for (int i=0; i<rooms.length; i++) {
			
			if (rooms[i] == res) {
				if (waitList.size() > 0) {
					String guest = waitList.remove(0);
					rooms[i] = new Reservation(guest, i);
				}
				else {
					rooms[i] = null;
				}
				
				return rooms[i];
			}
		}
		
		return null;		
	}
	
	public Reservation[] getRooms() {
		return rooms;
	}

	public String toString() {
		return Arrays.toString(rooms) + "\n" + waitList;
	}
}

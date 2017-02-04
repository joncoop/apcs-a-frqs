
public class HorseBarn {

	private Horse[] spaces;
	
	public HorseBarn(int numSpaces) {
		
		this.spaces = new Horse[numSpaces];
	}
	
	public int findHorseSpace(String name) {
		
		for (int i=0; i<spaces.length; i++) {
			Horse h = spaces[i];
			
			if (h != null && name.equals(h.getName())) {
				return i;
			}
		}
		
		return -1;
	}

	public void consolidate() {
		Horse[] temp = new Horse[spaces.length];
		
		int loc = 0;
		
		for (Horse h: spaces) {
						
			if (h != null) {
				temp[loc] = h;
				loc++;
			}
		}
		
		spaces = temp;
	}
	
	// just to get thing setup for testing
	public void putHorseInSpace(int index, Horse horse){
		spaces[index] = horse;
	}
	
	public void removeHorse(String name) {
		int loc = findHorseSpace(name);
		
		spaces[loc] = null;
	}
	
	public String toString() {
		String result = "HorseBarn:\n";
		
		for (int i=0; i<spaces.length; i++) {
			
			Horse h = spaces[i];
			
			if (h != null) {
				String name = h.getName();
				int weight = h.getWeight();
				
				result += "  " + i + " - " + name + ", " + weight + "\n";
			}
			else {
				result += "  " + i + " - null\n";
			}
		}
		
		return result.trim();
	}
}

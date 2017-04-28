
public class LogMessage {

	private String machineId;
	private String description;
	
	public LogMessage(String message) {
		
		int colonPos = message.indexOf(":");
		
		this.machineId = message.substring(0, colonPos);
		this.description = message.substring(colonPos + 1);
	}
	
	public boolean containsWord(String keyword) {
		
		String space = " ";
		
		String searchStr = space + description + space;
		
		return description.contains(space + keyword + space);
	}
	
	public String getMachineId() {
		return machineId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String toString() {
		return machineId + ":" + description;
	}
}

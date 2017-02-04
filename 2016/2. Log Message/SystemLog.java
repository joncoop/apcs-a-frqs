import java.util.ArrayList;
import java.util.List;


public class SystemLog {

	private List<LogMessage> messageList;
	
	public SystemLog() {
		messageList = new ArrayList<LogMessage>();
	}
	
	public void addMessage(LogMessage message) {
		messageList.add(message);
	}
	
	public List<LogMessage> removeMessages(String keyword) {
		
		List<LogMessage> result = new ArrayList<LogMessage>();
		
		for (int i=messageList.size() - 1; i>=0; i--) {
			LogMessage m = messageList.get(i);
			
			if (m.containsWord(keyword)){
				result.add(m);
				messageList.remove(i);
			}
		}
		
		return result;
	}
	
	public String toString() {
		String result = "SystemLog:\n";
		
		for (LogMessage m: messageList) {
			result += "  " + m + "\n";
		}
		
		return result.trim();
	}
}

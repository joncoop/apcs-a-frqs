import java.util.List;


public class LogMessageTester {

	public static void main(String[] args) {
		
		LogMessage m1 = new LogMessage("SERVER1:disk");
		LogMessage m2 = new LogMessage("SERVER2:error on disk");
		LogMessage m3 = new LogMessage("CLIENT1:error on /dev/disk disk");
		LogMessage m4 = new LogMessage("Webserver:error on disk DSK1");

		LogMessage m5 = new LogMessage("SERVER1:DISK");
		LogMessage m6 = new LogMessage("SERVER2:error on disk3");
		LogMessage m7 = new LogMessage("CLIENT1:error on /dev/disk");
		LogMessage m8 = new LogMessage("Webserver:diskette");
		
		LogMessage[] messages = {m1, m2, m3, m4, m5, m6, m7, m8};
		
		String query = "disk";
		for (LogMessage m: messages) {
			System.out.println(m.containsWord(query));
		}
		System.out.println();
		
		SystemLog theLog = new SystemLog();
		
		theLog.addMessage(new LogMessage("CLIENT3:security alert - repeated login failures"));
		theLog.addMessage(new LogMessage("Webserver:disk offline"));
		theLog.addMessage(new LogMessage("SERVER1:file not found"));
		theLog.addMessage(new LogMessage("SERVER2:read error on disk DSK1"));
		theLog.addMessage(new LogMessage("SERVER1:write error on disk DSK2"));
		theLog.addMessage(new LogMessage("Webserver:error on /dev/disk"));
		
		System.out.println(theLog);
		System.out.println();
		
		List<LogMessage> removed = theLog.removeMessages("disk");
		for (LogMessage m: removed) {
			System.out.println(m);
		}
		System.out.println();
		
		System.out.println(theLog);

	}
}

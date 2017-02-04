import java.util.ArrayList;
import java.util.List;


public class MusicDownloads {

	private List<DownloadInfo> downloadList;
	
	public MusicDownloads() {
		this.downloadList = new ArrayList<DownloadInfo>();
	}
	
	public DownloadInfo getDownloadInfo(String title) {
	
		for (DownloadInfo d: downloadList) {
			if (d.getTitle().equals(title)) {
				return d;
			}
		}
		
		return null;
	}
	
	public void updateDownloads(List<String> titles) {
		
		for (String t: titles) {
			
			DownloadInfo match = getDownloadInfo(t);
			
			if (match == null) {
				downloadList.add(new DownloadInfo(t));
			}
			else {
				match.incrementTimesDownloaded();
			}
		}
	}
	
	public String toString() {
		String result = "MusicDownloads:\n";
		
		for (DownloadInfo d: downloadList) {
			result += "  " + d.toString() + "\n";
		}
		
		return result.trim();
	}
}

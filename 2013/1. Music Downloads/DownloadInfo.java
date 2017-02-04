
public class DownloadInfo {

	private String title;
	private int timesDownloaded;
	
	public DownloadInfo(String title) {
		this.title = title;
		this.timesDownloaded = 1;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void incrementTimesDownloaded () {
		timesDownloaded += 1;
	}
	
	public String toString() {
		return "DownloadInfo [title=" + title + ", timesDownloaded=" + timesDownloaded + "]";
	}
	
}

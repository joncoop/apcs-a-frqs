import java.util.ArrayList;
import java.util.List;


public class MusicDownloadTester {

	public static void main(String[] args) {

		List<String> songTitles = new ArrayList<String>();

		for (int i=0; i<5; i++) {
			songTitles.add("Hey Jude");
		}
		
		for (int i=0; i<3; i++) {
			songTitles.add("Soul Sister");
		}

		for (int i=0; i<10; i++) {
			songTitles.add("Aqualung");
		}
		
		MusicDownloads webMusicA = new MusicDownloads();
		
		webMusicA.updateDownloads(songTitles);
		
		System.out.println(webMusicA);

		System.out.println(webMusicA.getDownloadInfo("Happy Birthday"));
	}

}

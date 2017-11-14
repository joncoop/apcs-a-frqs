public class Trail {
	
	public int[] markers;
	
	public Trail(int[] m) {
		markers = m;
	}
	
	public boolean isLevelTrailSegment(int start, int end) {
		
		int max = markers[start];
		int min = markers[start];
		
		for (int i=start+1; i<=end; i++) {
			if (markers[i] > max) {
				max = markers[i];
			}
			else if (markers[i] < min) {
				min = markers[i];
			}
		}
		
		return max - min <= 10;
	}
	
	public boolean isDifficult() {
		
		int changes = 0;
		
		for (int i=0; i<markers.length-1; i++) {
			int diff = Math.abs(markers[i] - markers[i+1]);
			
			if (diff >= 30) {
				changes++;
				
				if (changes > 2) {
					return true;
				}
			}
		}
		
		return false;
	}
}

public class Trail {
	
	public int[] markers;
	
	public Trail(int[] m) {
		markers = new int[m.length];
		
		for (int i=0; i<m.length; i++) {
			markers[i] = m[i];	
		}
	}
	
	public boolean isLevelTrailSegment(int start, int end) {
		
		int max = markers[start];
		int min = markers[start];
		
		for (int i=start+1; i<=end; i++) {
			max = Math.max(markers[i], max);
			min = Math.min(markers[i], min);
		}
		
		return max - min <= 10;
	}
	
	public boolean isDifficult() {
		
		int changes = 0;
		
		for (int i=0; i<markers.length-1; i++) {
			int diff = Math.abs(markers[i] - markers[i+1]);
			
			if (diff >= 30) {
				changes++;
			}
		}
		
		return changes >= 3;
	}
}

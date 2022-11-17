public class Trail {
	
	public int[] markers;
	
	public Trail(int[] markers) {
		this.markers = new int[markers.length];
		
		for (int i = 0; i<markers.length; i++) {
			this.markers[i] = markers[i];	
		}
	}
	
	public boolean isLevelTrailSegment(int start, int end) {
		
		int high = markers[start];
		int low = markers[start];
		
		for (int i = start + 1; i <= end; i++) {
			high = Math.max(markers[i], max);
			low = Math.min(markers[i], min);
		}
		
		return high - low <= 10;
	}
	
	public boolean isDifficult() {
		
		int bigChanges = 0;
		
		for (int i = 0; i < markers.length - 1; i++) {
			int diff = Math.abs(markers[i] - markers[i + 1]);
			
			if (diff >= 30) {
				bigChanges++;
			}
		}
		
		return bigChanges >= 3;
	}
}

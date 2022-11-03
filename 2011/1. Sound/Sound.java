import java.util.Arrays;

public class Sound {
	
	private int[] samples;
	
	public Sound(int[] samples) {
		this.samples = samples;
	}
	
	public int limitAmplitide(int limit) {
		int count = 0;
		
		for (int i = 0; i < samples.length; i++) {
			if (samples[i] > limit) {
				samples[i] = limit;
				count++;
			}
			else if (samples[i] < -limit) {
				samples[i] = -limit;
				count++;
			}
		}
		
		return count;
	}
	
	public void trimSilenceFromBeginning() {
		int start = 0; 
		
		while(samples[start] == 0) {
			start++;
		}
		
		int[] trimmed = new int[samples.length - start];
		
		for (int i = 0; i < trimmed.length; i++) {
			trimmed[i] = samples[i + start];
		}
		
		samples = trimmed;
	}
	
	public String toString() {
		return Arrays.toString(samples);
	}
}

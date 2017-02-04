public class SoundTester {
	
	public static void main(String[] args) {
		
		int[] amplitudes = {0, 0, 0, 0, 0, 5, 2, -3, 0, -8, 6, 9, 4, 0, -1, 0};
		
		Sound s = new Sound(amplitudes);
		
		System.out.println(s);
		
		s.limitAmplitide(5);
		System.out.println(s);
		
		s.trimSilenceFromBeginning();
		System.out.println(s);
	}
	
}

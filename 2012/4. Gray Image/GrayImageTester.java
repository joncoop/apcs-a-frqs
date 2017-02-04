
public class GrayImageTester {

	public static void main(String[] args) {

		int[][] pix1 = {{255, 184, 178,  84, 129},
				        { 84, 255, 255, 130,  84},
				        { 78, 255,   0,   0,  78},
				        { 84, 130, 255, 130,  84}};

		GrayImage img1 = new GrayImage(pix1);
		System.out.println();

		System.out.println( img1.countWhitePixels() );

		int[][] pix2 = {{221, 184, 178,  84, 135},
		                { 84, 255, 255, 130,  84},
		                { 78, 255,   0,   0,  78},
		                { 84, 130, 255, 130,  84}};

		GrayImage img2 = new GrayImage(pix2);
		
		img2.processImage();
		
		System.out.println(img2);
	}

}

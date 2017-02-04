import java.util.ArrayList;


public class StringTester {

	public static void main(String[] args) {

		String example = "sixtyzipperswerequicklypickedfromthewovenjutebag";
		
		StringCoder coder = new StringCoder(example);
		
		ArrayList<StringPart> encoded = coder.encodeString("overeager");
		System.out.println(encoded);
		
		System.out.println(coder.decodeString(encoded));
	}

}

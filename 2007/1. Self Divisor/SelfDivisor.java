public class SelfDivisor {

	public static boolean isSelfDivisor(int number) {

		int digits = number;

		while (digits > 0) {

			int digit = digits % 10;

			if (digit == 0 || number % digit != 0) {
				return false;
			}

			digits /= 10;
		}

		return true;
	}

	public static int[] firstNumSelfDivisors(int start, int num) {

		int[] result = new int[num];
		int current = start;

		int count = 0;

		while (count < num) {
			if (isSelfDivisor(current)) {
				result[count] = current;
				count++;
			}

			current++;
		}

		return result;
	}

}

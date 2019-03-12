package programs;

public class Threshold {
	public static String newString = "";

	public static void main(String[] args) {
		int threshold = 10;
		String num = "1234567879";

		int sum = digitSum(Integer.parseInt(num), threshold);
		System.out.println("Sum : " + sum);
		System.out.println("Threshold : " + threshold);
	}

	private static int digitSum(int num, int threshold) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			if (sum > threshold) {
				newString = newString + String.valueOf(sum);
				//System.out.println(newString);
				threshold = sum;
				sum = digitSum(sum, threshold);
			}
			num /= 10;
		}

		return sum;
	}

}

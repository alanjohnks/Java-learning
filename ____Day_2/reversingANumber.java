public class reversingANumber {
    public static void main(String[] args) {
        System.out.println("Reversing a Number");
        int num = 1234;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		System.out.println("Reversed = " + rev);  // Output: 4321
    }
}

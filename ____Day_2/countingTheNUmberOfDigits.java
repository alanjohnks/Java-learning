import java.util.Scanner;
public class countingTheNUmberOfDigits {
    public static void main(String[] args) {
        System.out.println("Counting The NUmber OF Digits");
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // input num = 12345
		int count = 0;
		while (num > 0) {
				num /= 10;
				count++;
		}
		System.out.println("Digits count = " + count);  // Output: 5
    }
}

import java.util.Scanner;
public class primeNumberCheck {
    public static void main(String[] args) {
        System.out.println("Prime Number Check");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		if (n <= 1) isPrime = false;
		for (int i = 2; i <= n / 2; i++) {
    		if (n % i == 0) {
        		isPrime = false;
        		break;
    		}
		}
		System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}

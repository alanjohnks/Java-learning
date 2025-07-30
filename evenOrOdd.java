import java.util.Scanner;
public class evenOrOdd {
    public static void main(String[] args) {
        System.out.println("Even or Odd");
        Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();;
		if (num % 2 == 0) {
				System.out.println("Even");
		} else {
				System.out.println("Odd");
		}
    }
}

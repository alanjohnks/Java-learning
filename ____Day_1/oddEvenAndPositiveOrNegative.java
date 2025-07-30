import java.util.Scanner;
public class oddEvenAndPositiveOrNegative {
    public static void main(String[] args) {
        System.out.println("Odd or Even and Positve or Negative");
        Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();	
		if(n>0 && n%2==0) {
			System.out.println("Postive Even");
		}
		else if (n>0 && n%2!=0) {
			System.out.println("Postive Odd");
		}
		else if(n<0 && n%2==0) {
			System.out.println("Negative Even");
		}
		else if(n<0 && n%2!=0) {
			System.out.println("Negative Odd");
		}
		else {
			System.out.println("Zero");
		}
    }
}

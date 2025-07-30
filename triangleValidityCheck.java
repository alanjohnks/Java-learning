import java.util.Scanner;
public class triangleValidityCheck {
    public static void main(String[] args) {
        System.out.println("Triangle Validity Check");
        Scanner sc=new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();	
		if((n1+n2)>n3 && (n2+n3)>n1 && (n1+n3)>n2) {
			System.out.println("Triangle");
		}
		else {
			System.out.println("Not a Triangle");
		}
    }
}

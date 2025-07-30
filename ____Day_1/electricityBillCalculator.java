import java.util.Scanner;
public class electricityBillCalculator {
    public static void main(String[] args) {
        System.out.println("Electricity Bill Calculator");
        Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();	
		int unit = sc.nextInt();
		int cost = sc.nextInt();	
		if(unit<100) {
			System.out.println(unit*cost);
		}
		else {
			System.out.println((unit-100)*cost);
		}
    }
}

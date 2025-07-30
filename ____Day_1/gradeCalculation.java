import java.util.Scanner;
public class gradeCalculation {
    public static void main(String[] args) {
        System.out.println("Garde Calculation");
        Scanner sc=new Scanner(System.in);
		int marks = sc.nextInt();	
		if(marks>85) {
			System.out.println("A grade");
		}
		else if (marks>75 ) {
			System.out.println("B grade");
		}
		else if (marks>50) {
			System.out.println("C grade");
		}	
		else {
			System.out.println("Fail");
		}
    }
}

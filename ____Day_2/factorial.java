import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of N Numbers");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = input.nextInt();
        int sum=1;
        for (int i=1;i<=N;i++){
            sum*=i;
        }
        System.out.println(sum);
    }
}

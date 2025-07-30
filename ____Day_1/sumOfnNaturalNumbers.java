import java.util.Scanner;
public class sumOfNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Sum of Natural Numbers");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = input.nextInt();
        int sum=0;
        for (int i=0;i<=N;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

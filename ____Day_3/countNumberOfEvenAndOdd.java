import java.util.Scanner;

public class countNumberOfEvenAndOdd {
    public static void main(String[] args) {
        System.out.println("Counting the number of even and odd in the given elements");
        System.out.print("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] numArray = new int[N];
        int even=0;
        int odd=0;
        for (int i=0;i<N;i++) {
            numArray[i] = sc.nextInt();
            if (numArray[i]%2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("The number of Even elements are: "+even);
        System.out.print("The number of Odd elements are: "+odd);
    }
}

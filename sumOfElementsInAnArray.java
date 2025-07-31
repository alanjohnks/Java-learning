import java.util.Scanner;
public class sumOfElementsInAnArray {
    public static void main(String[] args) {
        System.out.println("Sum of elements in the given array");
        System.out.print("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements: ");
        int sum=0;
        for (int j=0;j<N;j++) {
            arr[j] = sc.nextInt();
            sum+=arr[j];
        }
        System.out.print("The sum of the elements is: "+sum+".");
    }
}

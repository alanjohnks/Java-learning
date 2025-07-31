import java.util.Scanner;
public class maximumElementInAnArray {
    public static void main(String[] args) {
        System.out.println("Maximum element in an array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to find the maximum of: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements: ");
        int max=0;
        for (int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("The largest element from the given inputs is "+max+".");
    }
}

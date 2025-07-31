import java.util.Scanner;
public class secondLargestWithoutSorting {
    public static void main(String[] args) {
        System.out.println("Second largest of the given elements without sorting");
        System.out.print("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements: ");
        int max =0;
        int secondmax = 0;
        for (int j=0;j<N;j++) {
            arr[j] = sc.nextInt();
            if (arr[j]>max) {
                max = arr[j];
            }
        }
        for (int j=0;j<N;j++) {
            if (arr[j]<max && arr[j]>secondmax) {
                secondmax = arr[j];
            }
        }
        System.out.print("The second largest element is: "+secondmax+".");
    }
}

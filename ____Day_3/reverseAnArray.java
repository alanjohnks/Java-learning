import java.util.Scanner;
public class reverseAnArray {
    public static void main(String[] args) {
        System.out.println("Reversing the given array");
        System.out.print("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] reversedArray=new int[N];
        System.out.println("Enter the elements: ");
        for (int i=(N-1),j=0;i>=0&&j<N;i--,j++) {
            arr[j] = sc.nextInt();
            reversedArray[i] = arr[j];
            }
        for (int j=0;j<N;j++) {
            System.out.print("The reversed elements: "+reversedArray[j]+" ");
            }
    }
}

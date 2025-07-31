import java.util.Scanner;
public class rightRotationInterviewProblem {
    public static void main(String[] args) {
        System.out.println("Rotate Right Interview Problem");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int N=sc.nextInt();
        System.out.print("Enter the number of rotations: ");
        int K=sc.nextInt();
        int[] arr= new int[N];
        int[] rott=new int[N];
        System.out.print("Enter the elements: ");
        for (int i=0;i<N;i++) {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<N;i++) {
            rott[(i+K)%N] = arr[i];
        }
        int count=0;
        for (int i=0;i<N;i++) {
            if (rott[i]==arr[i]) {
                count++;
            }
        }
        System.out.println("The rotated array: ");
        for (int i=0;i<N;i++) {
            System.out.print(rott[i]+" ");
        }
        System.out.println();
        System.out.println("The number of identical elements are "+count+".");
    }
}

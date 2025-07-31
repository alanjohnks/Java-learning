public class trailingZeroes {
    public static void main(String[] args) {
        System.out.println("Move zeroes to end of an array without creating new array");
        int[] arr={0,2,3,0,4,1};
        int temp=0,pos=0;
        for (int i=0;i<6;i++) {
            if (arr[i]!=0) {
                temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
                pos++;
            }
        }
        for (int i=0;i<6;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

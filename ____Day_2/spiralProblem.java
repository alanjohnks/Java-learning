import java.util.Scanner;
public class problemOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i=0;i<6;i++){
            if (i==0){
                for (int j=0;j<4;j++){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            else if (i==1){
                int j = 3;
                for (int k=1;k<4;k++){
                    System.out.print(matrix[k][j]+" ");
                }
            }
            else if (i==2){
                int k = 3;
                for (int j=2;j>0;j--){
                    System.out.print(matrix[k][j]+" ");
                }
            }
            else if (i==3){
                int j = 0;
                for (int k=3;k>0;k--){
                    System.out.print(matrix[k][j]+" ");
                }
            }
            else if (i==4){
                int k = 1;
                for (int j=1;j<3;j++){
                    System.out.print(matrix[k][j]+" ");
                }
            }
            else if (i==5){
                int k = 2;
                for (int j=2;j>0;j--){
                    System.out.print(matrix[k][j]+" ");
                }
            }

        }

    }
}

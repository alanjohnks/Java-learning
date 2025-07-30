public class patternProblem {
    public static void main(String[] args) {
        int n=4;
//        SQUARE PATTERN
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        DIAGONAL
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

//        SPECIAL PATTERN
        for (int i=n;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

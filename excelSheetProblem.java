import java.util.Scanner;
import java.util.ArrayList;
public class excelSheetProblem {
    public static void main(String[] args) {
        System.out.println("ASCII VALUES");
        char[] alphabets= {'a','b','c','d','e',
                'f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u',
                'v','w','x','y','z'};
        Scanner input = new Scanner(System.in);
        ArrayList<Character> letter = new ArrayList<>();
        int userInput = input.nextInt();
        int N=userInput-1;
//        System.out.print(alphabets[N%26]);
        letter.add(alphabets[N%26]);
        while (N>26){
            N/=26;
            int mod = N%26;
            if (mod == 0){
//                System.out.print("z");
                letter.add('z');
            }
            else {
//                System.out.print(alphabets[mod-1]);
                letter.add(alphabets[mod-1]);
            }
        }
//        System.out.println();
        int listSize = letter.size()-1;
        for (int i=listSize;i>=0;i--){
            System.out.print(letter.get(i));
        }
    }
}

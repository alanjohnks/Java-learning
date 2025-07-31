import java.util.Scanner;
public class panagramProblem {
    public static void main(String[] args) {
        System.out.println("Panagram Check");
        Scanner sc = new Scanner(System.in);
        int[] panagram = new int[26];
        boolean pana = false;
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();
        System.out.println("The given sentence is ");
        System.out.print(sentence);
        System.out.println();
        char[] sentenceArray = sentence.toCharArray();
        for (int i=0;i<sentenceArray.length;i++) {
            if ((int) sentenceArray[i]>=97) {
                int asciiValue = (int) sentenceArray[i]-97;
                panagram[asciiValue] = 1;
            }
        }
        for (int i=0;i<26;i++) {
            System.out.print(panagram[i]+" ");
            if (panagram[i]==0) {
                pana = false;
                break;
            }
            else {
                pana = true;
            }
        }
        System.out.println();
        if (pana) {
            System.out.println("The given sentence is a panagram.");
        }
        else {
            System.out.println("The given sentence is not a panagram.");
        }
    }
}

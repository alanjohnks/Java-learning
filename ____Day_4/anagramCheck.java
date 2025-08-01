import java.util.Scanner;
public class anagramCheck {
    public static void main(String[] args) {
        System.out.println("Anagram Check Program");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String firstWord = input.nextLine();
        System.out.print("Enter the first word: ");
        String secondWord = input.nextLine();
        char[] firstArray = firstWord.toCharArray();
        char[] secondArray = firstWord.toCharArray();
        int length = firstWord.length();
        int[] Array = new int[26];
        boolean anagram = false;

        if (firstWord.length()!=secondWord.length()) {
            System.out.println("The given wors are not panagram.");
        }
        else {
            for (int i=0;i<length;i++) {
                Array[firstArray[i]-97]++;
                Array[secondArray[i]-97]--;
            }
        }
        for (int i=0;i<length;i++) {
            if (Array[i]==0) {
                anagram=true;
            }
            else {
                System.out.println("The given words are NOT anagram.");
                break;
            }
        }
        if (anagram) {
            System.out.println("The given words are ANAGARAM.✅");
        }
    }
}

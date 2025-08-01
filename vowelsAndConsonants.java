import java.util.Scanner;
public class vowelsAndConsonants {
    public static void main(String[] args) {
        System.out.println("Counting the number of Vowels and Consonants");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine().toLowerCase();
        int vowels=0;
        int space=0;
        int consonants=0;
        for (int i=0;i<sentence.length();i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' ||
            sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
                vowels++;
            }
            else if (sentence.charAt(i)==' ' || sentence.charAt(i)=='.' || sentence.charAt(i)==',') {
                space++;
            }
            else {
                consonants++;
            }
        }
        System.out.println("There are "+vowels+" vowels, "+consonants+
                " consonants and "+space+" other characters in the given sentence.");
    }
}

import java.util.Scanner;
public class countNumberOfWordsInASentence {
    public static void main(String[] args) {
        System.out.println("Counting the number of Words in a sentence");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();
        String[] stringArray = sentence.split(" ");
        System.out.println("There are "+stringArray.length+" words in the given sentence.");
    }
}

import java.util.Scanner;
public class longestWordInASentence {
    public static void main(String[] args) {
        System.out.println("Longest word in the given sentence.");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();
        String[] stringArray = sentence.split("[,\\.\\s]");
        String longest = new String();
        int max =0;
        for (int i=0;i<stringArray.length;i++) {
            System.out.println(i+". "+stringArray[i]);
            if (stringArray[i].length()>max) {
                max=stringArray[i].length();
                longest = stringArray[i];
            }
        }
        System.out.println("The longest word in the given sentence is "+longest);
    }
}

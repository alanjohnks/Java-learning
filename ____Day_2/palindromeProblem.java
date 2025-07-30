import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("PALINDROME PROGRAM");
        System.out.print("Enter the word to  check for palindrome: ");
        String word = input.nextLine();
        char[] wordChar = word.toCharArray();
        char[] reversedArray = new char[wordChar.length];
        int length=wordChar.length-1;
        for (int i=length,j=0;i>=0&&j<=length;i--,j++){
            reversedArray[j]=wordChar[i];
        }
        System.out.print("Reversed Word: ");
        for (int i=0;i<=length;i++){
            System.out.print(reversedArray[i]);
        }
        boolean palindrome = true;
        for (int i=0;i<=length;i++){
            if(reversedArray[i]==wordChar[i]){
                palindrome=true;
            }
            else{
                palindrome=false;
                break;
            }
        }
        if (palindrome){
            System.out.println();
            System.out.println("The given word is a palindrome.✅");
        }
        else {
            System.out.println();
            System.out.println("The given word is not a palindrome.❌");
        }
    }
}

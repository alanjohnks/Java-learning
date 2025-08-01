import java.util.Scanner;
public class stringIsRotatedOrNot {
    public static void main(String[] args) {
        System.out.println("String given is rotated");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String first = input.nextLine();
        System.out.print("Enter the rotated string: ");
        String rott = input.nextLine();
        String given = first+first;
        System.out.println(given);
        if (given.contains(rott)) {
            System.out.println("The given string is a rotated string.");
        }
        else {
            System.out.println("The given string is Not a rotated String.");
        }
    }
}

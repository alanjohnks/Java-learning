import java.util.Scanner;

public class monthDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Month days calculator");
        System.out.print("Enter the number of the month: ");
        int month = input.nextInt();
        switch (month){
            case 1:
                System.out.println("The month is January and it has 31 days.");
                break;
            case 2:
                System.out.println("The month is February and it has 28 days and in Leap year February has 29 days.");
                break;
            case 3:
                System.out.println("The month is March and it has 31 days.");
                break;
            case 4:
                System.out.println("The month is April and it has 30 days.");
                break;
            case 5:
                System.out.println("The month is May and it has 31 days.");
                break;
            case 6:
                System.out.println("The month is June and it has 30 days.");
                break;
            case 7:
                System.out.println("The month is July and it has 31 days.");
                break;
            case 8:
                System.out.println("The month is August and it has 31 days.");
                break;
            case 9:
                System.out.println("The month is September and it has 30 days.");
                break;
            case 10:
                System.out.println("The month is October and it has 31 days.");
                break;
            case 11:
                System.out.println("The month is November and it has 30 days.");
                break;
            case 12:
                System.out.println("The month is January and it has 31 days.");
                break;
        }

        input.close();
    }
}

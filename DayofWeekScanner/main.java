package Projects.DayofWeekScanner;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello Linux!");
        Scanner dayOfWeekScanner = new Scanner(System.in);
        System.out.println("Enter a number from 1-7 to represent the current day: ");
        System.out.println("1 for Sunday, 7 for Saturday");
        int dayOfWeek = dayOfWeekScanner.nextInt();
        dayOfWeekScanner.close();
        switch(dayOfWeek) {
            case 1:
                System.out.println("Today is Sunday.");
                break;
            case 2:
                System.out.println("Today is Monday.");
                break;
            case 3:
                System.out.println("Today is Tuesday.");
                break;
            case 4:
                System.out.println("Today is Wednesday.");
                break;
            case 5:
                System.out.println("Today is Thursday.");
                break;
            case 6: 
                System.out.println("Today is Friday.");
                break;
            case 7:
                System.out.println("Today is Saturday.");
                break;
            default:
                System.out.println("Invalid input. Please enter a number from 1-7.");
        }
    }
}
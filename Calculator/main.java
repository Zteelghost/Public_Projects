package Projects.Calculator;
import java.util.Scanner;

public class main {
    
    static void addMethod(int firstAddNumber, int secondAddNumber) {
        int finalCalc = firstAddNumber + secondAddNumber;
        System.out.println("The sum is: " + finalCalc + ".");
    }
    static void subtractMethod(int firstSubtractNumber, int secondSubtractNumber) {
        int finalCalc = firstSubtractNumber - secondSubtractNumber;
        System.out.println("The difference is: " + finalCalc + ".");
    }
    static void multiplyMethod(int firstMultiplyNumber, int secondMultiplyNumber) {
        int finalCalc = firstMultiplyNumber * secondMultiplyNumber;
        System.out.println("The product is: " + finalCalc + ".");
    }
    static void divideMethod(int firstDivideNumber, int secondDivideNumber) {
        int finalCalc = firstDivideNumber / secondDivideNumber;
        System.out.println("The quotient is: " + finalCalc + ".");
    }
    public static void main(String[] args) {
        Scanner outputByUser = new Scanner(System.in);
        System.out.println("Hello! Select an option: 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division.");
        switch (outputByUser.nextInt()) {
            case 1:
                System.out.println("You selected addition.");
                System.out.println("Enter your first number: ");
                int firstAddNumber = outputByUser.nextInt();
                System.out.println("Enter your second number: ");
                int secondAddNumber = outputByUser.nextInt();
                addMethod(firstAddNumber, secondAddNumber);
                break;
            case 2:
                System.out.println("You selected subtraction.");
                System.out.println("Enter your first number: ");
                int firstSubtractNumber = outputByUser.nextInt();
                System.out.println("Enter your second number: ");
                int secondSubtractNumber = outputByUser.nextInt();
                subtractMethod(firstSubtractNumber, secondSubtractNumber);
                break;
            case 3:
                System.out.println("You selected multiplication.");
                System.out.println("Enter your first number: ");
                int firstMultiplyNumber = outputByUser.nextInt();
                System.out.println("Enter your second number: ");
                int secondMultiplyNumber = outputByUser.nextInt();
                multiplyMethod(firstMultiplyNumber, secondMultiplyNumber);
                break;
            case 4:
                System.out.println("You selected division.");
                System.out.println("Enter your first number: ");
                int firstDivideNumber = outputByUser.nextInt();
                System.out.println("Enter your second number: ");
                int secondDivideNumber = outputByUser.nextInt();
                divideMethod(firstDivideNumber, secondDivideNumber);
                break;
            default:
                System.out.println("Invalid selection. Please select a valid option.");
        }
        outputByUser.close();
    }
}

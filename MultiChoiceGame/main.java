//
//Need to fix later
//
package Projects.MultiChoiceGame;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Scanner usersAnswer = new Scanner(System.in);
        System.out.println("Welcome to the Multi Choice Game!");
        System.out.println("Please enter your name:");
        String name = usersAnswer.nextLine();

        System.out.println("Hello, " + name + "! Let's start the game.");
        System.out.println("Question 1: What is the capital of Russia?");
        System.out.println("A) Moscow");
        System.out.println("B) Saint Petersburg");
        System.out.println("C) Novosibirsk");
        System.out.println("Type your answer (A, B, or C):");
        String answer1 = usersAnswer.nextLine();
        if (answer1.equalsIgnoreCase("A")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The correct answer is A) Moscow.");
        }
        System.out.println("Next question!");

        System.out.println("Question 2: What is the capital of the state of Maine?");
        System.out.println("A) Bangor");
        System.out.println("B) Portland");
        System.out.println("C) Augusta");
        System.out.println("Type your answer (A, B, or C):");
        String answer2 = usersAnswer.nextLine();
        if (answer2.equalsIgnoreCase("C")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The correct answer is C) Augusta.");
        }
        System.out.println("Next question!");
        
        System.out.println("Question 3: Which galaxy is our galaxy, the milky way, being pulled towards?");
        System.out.println("A) Andromeda");
        System.out.println("B) Triangulum");
        System.out.println("C) Sombrero");
        System.out.println("Type your answer (A, B, or C):");
        String answer3 = usersAnswer.nextLine();
        if (answer3.equalsIgnoreCase("A")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The correct answer is A) Andromeda.");
        }
        System.out.println("Thanks for playing, " + name + "!");

        usersAnswer.close();
    }
}

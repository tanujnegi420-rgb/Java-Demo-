import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = 0;   // Secret is now clearly named
        boolean isCorrect = false;  // This will control the loop

        while (!isCorrect) {  // Means: "While it is NOT correct, keep running"
            
            System.out.print("Guess Your Num : ");  // print (not println) for better UX
            int userGuess = sc.nextInt();

            if (userGuess > secretNumber) {
                System.out.println("Num is too high!");
            } else if (userGuess < secretNumber) {
                System.out.println("Num is too low!");
            } else {
                System.out.println("Correct Number!");
                isCorrect = true;  // This stops the loop next time it checks!
            }
        }
        sc.close();
    }
}
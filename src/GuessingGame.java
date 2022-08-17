import java.util.Scanner


public class GuessingGame {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        boolean correctGuess = false;
        int guess = 0;
        int increment = 0;

        System.out.println("Hello user.  What is your name?");

        String name = input.nextLine();

        System.out.println("Welcome " + name + "! I'm thinking of a number between 1 and 100.");

        Math.random();

        rand.nextInt(100);

    }

}

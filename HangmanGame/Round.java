import java.util.Scanner;

public class Round {
    private final Scanner scan = new Scanner(System.in);

    private Player player;
    private Mode mode;
    private int roundNumber;

    public Round(Player player, Mode mode, int roundNumber) {
        this.player = player;
        this.mode = mode;
        this.roundNumber = roundNumber;
    }

    public void playRound(int index) {
        do {
            System.out.println("HANGMAN EXTREME\n");
            System.out.println("LIVES   : " + player.getLives());
            System.out.println("POINTS  : " + player.getPoints());

            mode.getMode();

            System.out.println("Q: " + mode.getQuestion(index));
            System.out.println("A: " + player.getModifiedAnswer());

            System.out.print("\nGuess a character: ");
            char guess = scan.next().charAt(0);
            player.setGuess(guess);
            player.checkAndDisplay(index);

            if (player.getLives() == 0) {
                System.out.println("\nGAME OVER!");
                System.out.println("The answer was "+mode.getAnswer(index));
            }

            if (player.getModifiedAnswer().toUpperCase().equals(mode.getAnswer(index).toUpperCase())) {
                System.out.println("\nYOU GUESSED CORRECTLY!");
                System.out.println("The answer is "+mode.getAnswer(index));
                System.out.println("Points Gained: " + player.getPoints());
                //System.out.println("NextQuestion\n");
                player.setPoints();
                break;
            }

            System.out.println("-----------------------------------------------------------");
            if (player.getLives() == 0) {
                System.out.println("YOU HAVE NO MORE LIVES, GAME OVER!");

                // Prompt the user to continue playing or exit
                System.out.print("\nDo you want to continue playing? [Y-yes, N-no]: ");
                char continueChoice = scan.next().charAt(0);

                if (Character.toUpperCase(continueChoice) == 'N') {
                    System.out.println("\nThank you for playing, Goodbye!");
                    System.exit(0);  // Exit the program
                } else {
                    continue;
                }
            }
        } while (player.getLives() != 0);

        System.out.println("-----------------------------------------------------------");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("HANGMAN EXTREME\n");
        System.out.print("Welcome, do you want to play? [Y-yes, N-no]: ");

        char choice;
        char startChoice;

        choice = scan.next().charAt(0);
        startChoice = Character.toUpperCase(choice);

        while (startChoice != 'N') {
            System.out.println("-----------------------------------------------------------");
            Player player = new Player();
            EasyMode easyMode = new EasyMode();
            MediumMode mediumMode = new MediumMode();
            HardMode hardMode = new HardMode();
            BonusMode bonusMode = new BonusMode();

            //sulod array ang mga mode
            Mode[] modes = { easyMode, mediumMode, hardMode, bonusMode };

            //balhin na diri para di kaayo taas ang main HAHA
            Game game = new Game();

            game.playGame(player, modes);

            System.out.print("Do you still want to play? [Y-yes, N-no]: ");
            choice = scan.next().charAt(0);
            startChoice = Character.toUpperCase(choice);
        }
    }
}
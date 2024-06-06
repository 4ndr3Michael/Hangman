import java.util.Random;

public class Game {
    private static final int NUM_ROUNDS_PER_MODE = 3;
    private static final int NUM_MODES = 4; //easy, medium, hard, bonus

    Random random = new Random();

    public void playGame(Player player, Mode[] modes) {
        //modes from easy to bonus na mode
        for (int modeIndex = 0; modeIndex < NUM_MODES; modeIndex++) {
            //pila kaquestions kada mode
            for (int roundNumber = 1; roundNumber <= NUM_ROUNDS_PER_MODE; roundNumber++) {
                int index = random.nextInt(10); // Adjust the range based on the number of questions in each mode
                Round round = new Round(new Player(modes[modeIndex], index), modes[modeIndex], roundNumber);
                round.playRound(index);
            }
        }
    }
}
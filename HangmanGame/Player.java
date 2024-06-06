public class Player {
    private Mode mode;
    private StringBuilder modifiedAnswer;
    private char guess;
    private int points = 0;
    private int lives = 6;

    public Player() {
    }

    public Player(Mode mode, int index) {
        this.mode = mode;
        initializeModifiedAnswer(mode.getAnswer(index));
    }

    private void initializeModifiedAnswer(String answer) {
        modifiedAnswer = new StringBuilder(answer.replaceAll("[a-zA-Z]", "_"));
    }

    public void setGuess(char guess) {
        this.guess = guess;
    }

    public char getGuess() {
        return guess;
    }

    public int getLives() {
        return lives;
    }

    public void setPoints() {
        this.points++;
    }

    public int getPoints() {
        return points;
    }

    public String getModifiedAnswer() {
        return modifiedAnswer.toString();
    }

    public void checkAndDisplay(int i) {
        int flag = 0;
        String answer = mode.getAnswer(i);

        for (int ctr = 0; ctr < answer.length(); ctr++) {
            if (Character.toUpperCase(guess) == Character.toUpperCase(answer.charAt(ctr))) {
                flag = 1;
                System.out.println("CORRECT");
                setPoints();
                break;
            }
        }

        if (flag == 1) {
            for (int ctr = 0; ctr < answer.length(); ctr++) {
                if (Character.toUpperCase(guess) == Character.toUpperCase(answer.charAt(ctr))) {
                    modifiedAnswer.setCharAt(ctr, guess);
                }
            }
        } else {
            lives--;
            System.out.println("INCORRECT");
            hangmanDraw();

            if (modifiedAnswer.length() == 0) {
                initializeModifiedAnswer(answer);
            }
        }
    }

    private void hangmanDraw() {
        //System.out.println("");
        switch (lives) {
            case 5:
                //System.out.print("\033[5;10H");
                System.out.println("\t\t\t\t\t --------| ");
                System.out.println("\t\t\t\t\t   O     |");
                System.out.println("\t\t\t\t\t         |");
                System.out.println("\t\t\t\t\t         |");
                System.out.println("\t\t\t\t\t         |");

                break;
            case 4:
                //System.out.print("\033[5;10H");
                System.out.println("\t\t\t\t\t --------| ");
                System.out.println("\t\t\t\t\t    O    |");
                System.out.println("\t\t\t\t\t    |    |");
                System.out.println("\t\t\t\t\t         |");
                System.out.println("\t\t\t\t\t         |");
                System.out.println("\t\t\t\t\t         |");

                break;
            case 3:
                //System.out.print("\033[5;10H");
                System.out.println("\t\t\t\t\t --------| ");
                System.out.println("\t\t\t\t\t    O    |");
                System.out.println("\t\t\t\t\t   /|    |");
                System.out.println("\t\t\t\t\t         |");
                System.out.println("\t\t\t\t\t         |");
                System.out.println("\t\t\t\t\t         |");

                break;
            case 2:
                //System.out.print("\033[5;10H");
                System.out.println("\t\t\t\t\t --------| ");
                System.out.println("\t\t\t\t\t    O    |");
                System.out.println("\t\t\t\t\t   /|\\   |");
                System.out.println("\t\t\t\t\t         |");
                System.out.println("\t\t\t\t\t         |");
                System.out.println("\t\t\t\t\t         |");

                break;
            case 1:
                //System.out.print("\033[5;10H");
                System.out.println("\t\t\t\t\t --------| ");
                System.out.println("\t\t\t\t\t    O    |");
                System.out.println("\t\t\t\t\t   /|\\   |");
                System.out.println("\t\t\t\t\t   /     |");
                System.out.println("\t\t\t\t\t         |");
                System.out.println("\t\t\t\t\t         |");
                System.out.println("\t\t\t\t\t         |");

                break;
            case 0:
                //System.out.print("\033[5;10H");
                System.out.println("\t\t\t\t\t --------| ");
                System.out.println("\t\t\t\t\t    O    |");
                System.out.println("\t\t\t\t\t   /|\\   |");
                System.out.println("\t\t\t\t\t   / \\   |");
                System.out.println("\t\t\t\t\t         |");
                System.out.println("\t\t\t\t\t         |");
                System.out.println("\t\t\t\t\t         |");
                break;


        }
    }


    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }
}





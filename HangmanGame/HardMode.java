public class HardMode implements Mode{
    private String[] questions = new String[10];
    private String[] answers = new String[10];

    public HardMode() {
        questions[0] = "The smallest country in the world by land area";
        answers[0] = "Vatican City";

        questions[1] = "The name of the world's largest coral reef system";
        answers[1] = "Great Barrier Reef";

        questions[2] = "The name of the world's largest living reptile";
        answers[2] = "Saltwater Crocodile";

        questions[3] = "World's largest rodent";
        answers[3] = "Capybara";

        questions[4] = "The fear of the number 13 called";
        answers[4] = "Triskaidekaphobia";

        questions[5] = "A word or phrase that reads the same backward and forward";
        answers[5] = "Palindrome";

        questions[6] = "Sculpted “The Thinker”";
        answers[6] = "Auguste Rodin";

        questions[7] = "The “King of Pop”";
        answers[7] = "Michael Jackson";

        questions[8] = "Lead singer of the band Queen";
        answers[8] = "Freddie Mercury";

        questions[9] = "The first man in space";
        answers[9] = "Yuri Gagarin";
    }

    @Override
    public String getQuestion(int i) {
        return questions[i];
    }

    @Override
    public String getAnswer(int i) {
        return answers[i];
    }

    @Override
    public void getMode() {
        System.out.println("(HARD MODE)\n");
    }
}
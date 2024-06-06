public class EasyMode implements Mode{
    private String[] questions = new String[10];
    private String[] answers = new String[10];

    public EasyMode() {
        questions[0] = "Tried to conquer the Philippines";
        answers[0] = "magellan";

        questions[1] = "Largest Mammal";
        answers[1] = "bluewhale";

        questions[2] = "Red Planet";
        answers[2] = "mars";

        questions[3] = "National Hero";
        answers[3] = "jose rizal";

        questions[4] = "#1 top sport in the Philippines";
        answers[4] = "basketball";

        questions[5] = "Students in CIT-U";
        answers[5] = "teknoys";

        questions[6] = "Popular MOBA game";
        answers[6] = "mobile legends";

        questions[7] = "Highest Mountain";
        answers[7] = "mount everest";

        questions[8] = "We can’t live without";
        answers[8] = "oxygen";

        questions[9] = "Alligator Pear";
        answers[9] = "avocado";
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
        System.out.println("(EASY MODE)\n");
    }
}
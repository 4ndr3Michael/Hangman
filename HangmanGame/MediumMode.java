public class MediumMode implements Mode{
    private String[] questions = new String[10];
    private String[] answers = new String[10];

    public MediumMode() {
        questions[0] = "Makes up 78% of the Earth's atmosphere";
        answers[0] = "Nitrogen";

        questions[1] = "Capital of Australia";
        answers[1] = "Canberra";

        questions[2] = "Mona Lisa";
        answers[2] = "Leonardo da Vinci";

        questions[3] = "Romeo and Juliet";
        answers[3] = "William Shakespeare";

        questions[4] = "Largest Ocean";
        answers[4] = "Pacific Ocean";

        questions[5] = "Biggest tech company in South Korea";
        answers[5] = "Samsung";

        questions[6] = "Powerhouse of the cell";
        answers[6] = "Mitochondria";

        questions[7] = "Longest river";
        answers[7] = "Nile River";

        questions[8] = "Natural Food Making Process";
        answers[8] = "Photosynthesis";

        questions[9] = "Process where liquid turns into vapor or gas";
        answers[9] = "Evaporation";
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
        System.out.println("(MEDIUM MODE)\n");
    }
}
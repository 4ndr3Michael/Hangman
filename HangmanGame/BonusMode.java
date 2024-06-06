public class BonusMode implements Mode{
    private String[] questions = new String[10];
    private String[] answers = new String[10];

    public BonusMode() {
        questions[0] = "Coolest JAVA OOP Instructor in CIT-U";
        answers[0] = "Kenn Migan Vincent C Gumonan";

        questions[1] = "The founder of Cebu Institute of Technology - University";
        answers[1] = "Dr Nicolas G Escario Sr";

        questions[2] = "The name of the main building in CIT-U";
        answers[2] = "Don Rodolfo T Lizares Sr";

        questions[3] = "The name of the newly built 8-storey building in CIT-U";
        answers[3] = "Gregorio L Escario";

        questions[4] = "The composer of the CIT-U hymn";
        answers[4] = "Engr Leon Magbanua";

        questions[5] = "The hardest subject in the second year for BSIT";
        answers[5] = "Data Structures and Algorithms";

        questions[6] = "The CIT-U Motto";
        answers[6] = "VIRTUS IN SCIENTIA ET TECNOLOGIA";

        questions[7] = "The Vice-President for Academic Affairs";
        answers[7] = "Atty Corazon Valencia";

        questions[8] = "Lung Disease (Fancy Version)";
        answers[8] = "Pneumonoultramicroscopicsilicovolcanoconiosis";

        questions[9] = "First quote of Sir Khai";
        answers[9] = "Good Practice makes Perfect";
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
        System.out.println("(BONUS MODE)\n");
    }
}
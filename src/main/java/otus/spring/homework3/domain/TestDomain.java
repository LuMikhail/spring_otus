package otus.spring.homework3.domain;

public class TestDomain {

    private final String question;
    private final String answers;
    private final String rightAnswer;

    public TestDomain(String question, String answers, String rightAnswer) {
        this.question = question;
        this.answers = answers;
        this.rightAnswer = rightAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswers() {
        return answers;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    @Override
    public String toString() {
        return String.format("TestDomain(question=%s ,answers=%s ,rightAnswer=%s)",
                this.question,
                this.answers,
                this.rightAnswer);
    }
}

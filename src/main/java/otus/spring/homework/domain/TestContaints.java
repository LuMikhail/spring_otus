package otus.spring.homework.domain;

public class TestContaints {

    private String question;
    private String answers;

    public TestContaints(String question, String answers) {
        this.question = question;
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return String.format("TestContaints(question=%s ,answers=%s)",
                this.question,
                this.answers);
    }
}

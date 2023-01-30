package otus.spring.homework.hm1.domain;

public class TestDomain {

    private final String question;
    private final String answers;

    public TestDomain(String question, String answers) {
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
        return String.format("TestDomain(question=%s ,answers=%s)",
                this.question,
                this.answers);
    }
}

package otus.spring.homework2.service;

import org.springframework.stereotype.Service;
import otus.spring.homework2.dao.Input;
import otus.spring.homework2.dao.Output;
import otus.spring.homework2.domain.Student;
import otus.spring.homework2.domain.TestDomain;

import java.util.List;

@Service
public class ResultTestService implements FinalResult {

    private final Output output;
    private final Input input;

    public ResultTestService(Output output, Input input) {
        this.output = output;
        this.input = input;
    }

    @Override
    public void changeResult(List<TestDomain> test, Student student) {
        for (TestDomain t : test) {
            output.println("Answer the questions: %s\n %s\n", t.getQuestion(), t.getAnswers());
            String answer = input.askStr("Choose one correct answer: ");
            if (answer.equals(t.getRightAnswer())) {
                student.setFinalScore(student.getFinalScore() + 1);
            }
        }
        output.println("Student %s %s have result %d, the maximum %s",
                student.getFirstName(), student.getLastName(), student.getFinalScore(), test.size());
    }
}

package otus.spring.homework3.service;

import org.springframework.stereotype.Service;
import otus.spring.homework3.dao.Input;
import otus.spring.homework3.dao.Output;
import otus.spring.homework3.domain.Student;
import otus.spring.homework3.domain.TestDomain;
import otus.spring.homework3.service.locale.LocaleTesting;

import java.util.List;

@Service
public class СonductingTestingService implements CondictingTesting {

    private final Output output;
    private final Input input;
    private final LocaleTesting localeTesting;

    public СonductingTestingService(Output output, Input input, LocaleTesting localeTesting) {
        this.output = output;
        this.input = input;
        this.localeTesting = localeTesting;
    }

    @Override
    public void passTest(List<TestDomain> test, Student student) {
        localeTesting.startLocaleWhatTestAbout();
        for (TestDomain t : test) {
            output.println("%s\n %s", t.getQuestion(), t.getAnswers());
            String answer = input.askStr(".\n");
            if (answer.equals(t.getRightAnswer())) {
                student.setFinalScore(student.getFinalScore() + 1);
            }
        }
        output.println(localeTesting.getLocaleTestReport(),
                student.getFirstName(), student.getLastName(), student.getFinalScore(), test.size());
    }
}

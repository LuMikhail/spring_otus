package otus.spring.homework.hm2.service;

import org.springframework.stereotype.Service;
import otus.spring.homework.hm2.dao.Input;
import otus.spring.homework.hm2.dao.Output;
import otus.spring.homework.hm2.dao.TestDao;
import otus.spring.homework.hm2.domain.Student;
import otus.spring.homework.hm2.domain.TestDomain;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private final TestDao dao;
    private final Output output;
    private final Input input;
    private final StudentService studentService;

    public TestServiceImpl(TestDao dao, Output output, Input input, StudentService studentService) {
        this.dao = dao;
        this.output = output;
        this.input = input;
        this.studentService = studentService;
    }

    @Override
    public void runTest() {
        output.println("Take the test on the basic sql commands and answer the questions:\n");
        Student student = studentService.createNewStudent();
        output.println(" %s %s let's start testing\n", student.getFirstName(), student.getLastName());
        List<TestDomain> test = dao.loud();
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

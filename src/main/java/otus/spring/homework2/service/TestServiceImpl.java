package otus.spring.homework2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import otus.spring.homework2.dao.*;
import otus.spring.homework2.domain.Student;
import otus.spring.homework2.domain.TestDomain;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TestServiceImpl implements TestService {

    private final Source source;
    private final Output output;
    private final StudentService studentService;
    private final TestCsv testCsv;
    private final FinalResult resultTestService;

    @Override
    public void runTest() {
        output.println("Take the test on the basic sql commands and answer the questions:\n");
        Student student = studentService.createNewStudent();
        output.println(" %s %s let's start testing\n", student.getFirstName(), student.getLastName());
        List<TestDomain> test = testCsv.createTestFromCsv(source.readResource());
        resultTestService.changeResult(test, student);
    }
}

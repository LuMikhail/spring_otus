package otus.spring.homework3.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import otus.spring.homework3.dao.Source;
import otus.spring.homework3.dao.TestCsv;
import otus.spring.homework3.domain.Student;
import otus.spring.homework3.domain.TestDomain;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TestServiceImpl implements TestService {

    private final Source source;
    private final StudentService studentService;
    private final TestCsv testCsv;
    private final CondictingTesting resultTestService;

    @Override
    public void runTest() {
        Student student = studentService.createNewStudent();
        List<TestDomain> test = testCsv.createTestFromCsv(source.readResource());
        resultTestService.passTest(test, student);
    }
}

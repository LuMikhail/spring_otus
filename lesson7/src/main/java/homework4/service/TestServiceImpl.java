package homework4.service;

import homework4.dao.Source;
import homework4.dao.TestCsv;
import homework4.domain.Student;
import homework4.domain.TestDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

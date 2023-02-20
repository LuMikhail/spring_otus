package otus.spring.homework3.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import otus.spring.homework3.domain.TestDomain;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TestCsvImplTest {

    @Autowired
    private TestCsv testCsv;

    @Test
    void checkCreateTestFromCsv() {
        List<String> list = Arrays.asList("Hello;1 word, 2 dog;1", "Today;1 monday, 2 sunday;2");
        List<TestDomain> testCsvList = testCsv.createTestFromCsv(list);
        assertThat(testCsvList.get(1).getRightAnswer()).isEqualTo("2");
        assertThat(testCsvList.get(0).getQuestion()).isEqualTo("Hello");
        assertThat(testCsvList.get(0).getAnswers()).contains("word");
    }
}

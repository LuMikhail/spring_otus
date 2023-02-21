package homework4.dao;

import homework4.domain.TestDomain;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class TestCsvImplTest {

    @ComponentScan("homework4.dao")
    @Configuration
    static class CsvConfiguration {

    }

    @Autowired
    private TestCsv testCsv;

    @Test
    void shouldCreateListTestDomainFromCsv() {
        List<String> csv = Arrays.asList("Hello;1 word, 2 dog;1", "Today;1 monday, 2 sunday;2");
        List<TestDomain> result = testCsv.createTestFromCsv(csv);
        assertThat(result.get(1).getRightAnswer()).isEqualTo("2");
        assertThat(result.get(0).getQuestion()).isEqualTo("Hello");
        assertThat(result.get(1).getAnswers()).contains("sunday");
    }
}
package otus.spring.homework2.dao;

import org.springframework.stereotype.Component;
import otus.spring.homework2.domain.TestDomain;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TestCsvImpl implements TestCsv {

    @Override
    public List<TestDomain> createTestFromCsv(List<String> lines) {
        return lines.stream().map(s -> s.split(";"))
                .map(arr -> new TestDomain(arr[0], arr[1], arr[2])).collect(Collectors.toList());
    }
}

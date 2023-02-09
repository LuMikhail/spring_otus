package otus.spring.homework2.dao;

import otus.spring.homework2.domain.TestDomain;

import java.util.List;

public interface TestCsv {

    List<TestDomain> createTestFromCsv(List<String> lines);
}

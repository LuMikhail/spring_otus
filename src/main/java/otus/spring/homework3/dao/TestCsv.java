package otus.spring.homework3.dao;

import otus.spring.homework3.domain.TestDomain;

import java.util.List;

public interface TestCsv {

    List<TestDomain> createTestFromCsv(List<String> lines);
}

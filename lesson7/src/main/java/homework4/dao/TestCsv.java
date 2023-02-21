package homework4.dao;

import homework4.domain.TestDomain;

import java.util.List;

public interface TestCsv {

    List<TestDomain> createTestFromCsv(List<String> lines);
}

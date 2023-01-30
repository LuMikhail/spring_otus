package otus.spring.homework.dao;

import otus.spring.homework.domain.TestContaints;

import java.util.List;

public interface TestDao {

    List<TestContaints> loud(String path);
}

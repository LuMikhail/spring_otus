package otus.spring.homework.service;

import otus.spring.homework.domain.TestContaints;

import java.util.List;

public interface TestService {

    List<TestContaints> getByAll(String path);
}

package otus.spring.homework.hm1.service;

import otus.spring.homework.hm1.domain.TestDomain;

import java.util.List;

public interface TestService {

    List<TestDomain> getByAll(String path);
}

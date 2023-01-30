package otus.spring.homework.hm1.service;

import otus.spring.homework.hm1.dao.TestDao;
import otus.spring.homework.hm1.domain.TestDomain;

import java.util.List;

public class TestServiceImpl implements TestService {

    private final TestDao dao;

    public TestServiceImpl(TestDao dao) {
        this.dao = dao;
    }

    public List<TestDomain> getByAll(String path) {
        return dao.loud(path);
    }
}

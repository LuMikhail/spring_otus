package otus.spring.homework.service;

import otus.spring.homework.dao.TestDao;
import otus.spring.homework.domain.TestContaints;

import java.util.List;

public class TestServiceImpl implements TestService {

    private final TestDao dao;

    public TestServiceImpl(TestDao dao) {
        this.dao = dao;
    }

    public List<TestContaints> getByAll(String path) {
        return dao.loud(path);
    }
}

package otus.spring.homework.hm2.dao;

import otus.spring.homework.hm2.domain.TestDomain;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestDaoSimple implements TestDao {

    private final String resource;

    public TestDaoSimple(String resource) {
        this.resource = resource;
    }

    @Override
    public List<TestDomain> loud() {
        InputStream inputStream = getResource(resource);
        return buildTest(inputStream);
    }

    private InputStream getResource(String resource) {
        return TestDaoSimple.class.getClassLoader().getResourceAsStream(resource);
    }

    private List<TestDomain> buildTest(InputStream inputStream) {
        List<TestDomain> testingList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            testingList = br.lines()
                    .map(s -> s.split(";"))
                    .map(arr -> new TestDomain(arr[0], arr[1], arr[2]))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return testingList;
    }
}

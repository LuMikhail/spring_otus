package otus.spring.homework.hm2.dao;

import otus.spring.homework.hm2.domain.TestDomain;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestDaoSimple implements TestDao {

    private final String resource;

    public TestDaoSimple(String resource) {
        this.resource = resource;
    }

    private InputStream getResource(String resource) {
        return TestDaoSimple.class.getClassLoader().getResourceAsStream(resource);
    }

    @Override
    public List<TestDomain> loud() {
        InputStream inputStream = getResource(resource);
        return buildTest(inputStream);
    }

    public List<TestDomain> buildTest(InputStream inputStream) {
        List<TestDomain> testingList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            br.lines().forEach(s -> {
                String[] arr = s.split(";");
                TestDomain test = new TestDomain(arr[0], arr[1], arr[2]);
                testingList.add(test);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return testingList;
    }
}

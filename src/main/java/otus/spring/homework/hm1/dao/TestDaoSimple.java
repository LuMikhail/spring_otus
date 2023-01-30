package otus.spring.homework.hm1.dao;

import otus.spring.homework.hm1.domain.TestDomain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestDaoSimple implements TestDao {

    public List<TestDomain> loud(String path) {
        InputStream inputStream = TestDaoSimple.class.getClassLoader().getResourceAsStream(path);
        List<TestDomain> testingList = new ArrayList<>();
        try {
            assert inputStream != null;
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                br.lines().forEach(s -> {
                    String[] arr = s.split(";");
                    TestDomain test = new TestDomain(arr[0], arr[1]);
                    testingList.add(test);
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return testingList;
    }
}

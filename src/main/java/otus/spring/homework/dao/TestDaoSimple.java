package otus.spring.homework.dao;

import otus.spring.homework.domain.TestContaints;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestDaoSimple implements TestDao {

    public List<TestContaints> loud(String path) {
        InputStream inputStream = TestDaoSimple.class.getClassLoader().getResourceAsStream(path);
        List<TestContaints> testingList = new ArrayList<>();
        try {
            assert inputStream != null;
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                br.lines().forEach(s -> {
                    String[] arr = s.split(";");
                    TestContaints test = new TestContaints(arr[0], arr[1]);
                    testingList.add(test);
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return testingList;
    }
}

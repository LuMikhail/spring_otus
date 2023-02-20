package otus.spring.homework3.dao;

import otus.spring.homework3.exception.SourceNotFoundException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SourceCsv implements Source {

    private final String resource;

    public SourceCsv(String resource) {
        this.resource = resource;
    }

    @Override
    public List<String> readResource() {
        List<String> result = new ArrayList<>();
        InputStream inputStream = SourceCsv.class.getClassLoader().getResourceAsStream(resource);
        try {
            assert inputStream != null;
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                br.lines().forEach(result::add);
            }
        } catch (Exception e) {
            throw new SourceNotFoundException("Not found source: " + resource, e);
        }
        return result;
    }
}

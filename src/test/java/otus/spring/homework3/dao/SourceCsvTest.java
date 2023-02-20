package otus.spring.homework3.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.BDDMockito.given;

@SpringBootTest
class SourceCsvTest {

    @MockBean
    private Source source;

    @Test
    void getByAll() {
        given(source.readResource())
                .willReturn(Stream.of(
                                "To create a new table in an existing database CREATE TABLE, 1",
                                "To addition a new table, insert into, 1")
                        .collect(Collectors.toList()));
        Assertions.assertEquals(2, source.readResource().size());
    }
}

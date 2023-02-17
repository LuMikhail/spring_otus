package otus.spring.homework3.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import otus.spring.homework3.dao.Source;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class SourceCsvTest {

    @Mock
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

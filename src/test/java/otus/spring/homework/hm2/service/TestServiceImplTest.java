package otus.spring.homework.hm2.service;

import org.junit.experimental.theories.DataPoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import otus.spring.homework.hm2.dao.Input;
import otus.spring.homework.hm2.dao.Output;
import otus.spring.homework.hm2.dao.TestDao;
import otus.spring.homework.hm2.domain.TestDomain;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class TestServiceImplTest {

    @Mock
    private TestDao testDao;

    @Test
    void getByAll() {
        given(testDao.loud())
                .willReturn(Stream.of(
                                new TestDomain("To create a new table in an existing database",
                                        "CREATE TABLE", "1"),
                                new TestDomain("To addition a new table", "insert into", "1"))
                        .collect(Collectors.toList()));
        Assertions.assertEquals(2, testDao.loud().size());
    }
}

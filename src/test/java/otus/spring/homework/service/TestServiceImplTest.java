package otus.spring.homework.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import otus.spring.homework.dao.TestDao;
import otus.spring.homework.domain.TestContaints;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class TestServiceImplTest {

    @Mock
    private TestDao testDao;

    private TestService testService;

    @BeforeEach
    void setUp() {
        testService = new TestServiceImpl(testDao);
    }

    @Test
    void getByAll() {
        given(testDao.loud(any()))
                .willReturn(Stream.of(
                                new TestContaints("To create a new table in an existing database", "CREATE TABLE"),
                                new TestContaints("To addition a new table", "insert into"))
                        .collect(Collectors.toList()));

        Assertions.assertEquals(2, testService.getByAll("").size());
    }
}
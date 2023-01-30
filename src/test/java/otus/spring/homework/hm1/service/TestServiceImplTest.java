package otus.spring.homework.hm1.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import otus.spring.homework.hm1.dao.TestDao;
import otus.spring.homework.hm1.domain.TestDomain;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class TestServiceImplTest {

    @Mock
    private TestDao testDao;
    private  TestService testService;

    @BeforeEach
    void setUp() { testService = new TestServiceImpl(testDao);
    }

    @Test
    void getByAll() {
        given(testDao.loud(any()))
                .willReturn(Stream.of(
                        new TestDomain("To create a new table in an existing database", "CREATE TABLE"),
                                new TestDomain("To addition a new table", "insert into"))
                        .collect(Collectors.toList()));
        Assertions.assertEquals(2, testService.getByAll("").size());
    }
}
package otus.spring.homework2.service;

import otus.spring.homework2.domain.Student;
import otus.spring.homework2.domain.TestDomain;

import java.util.List;

public interface CondictingTesting {
    void passTest(List<TestDomain> test, Student student);
}

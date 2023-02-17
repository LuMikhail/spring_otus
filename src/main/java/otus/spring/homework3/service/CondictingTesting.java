package otus.spring.homework3.service;

import otus.spring.homework3.domain.Student;
import otus.spring.homework3.domain.TestDomain;

import java.util.List;

public interface CondictingTesting {
    void passTest(List<TestDomain> test, Student student);
}

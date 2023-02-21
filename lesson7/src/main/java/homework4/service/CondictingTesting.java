package homework4.service;

import homework4.domain.Student;
import homework4.domain.TestDomain;

import java.util.List;

public interface CondictingTesting {
    void passTest(List<TestDomain> test, Student student);
}

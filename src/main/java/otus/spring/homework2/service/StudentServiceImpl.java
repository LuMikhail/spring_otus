package otus.spring.homework2.service;

import org.springframework.stereotype.Service;
import otus.spring.homework2.dao.Input;
import otus.spring.homework2.domain.Student;

@Service
public class StudentServiceImpl implements StudentService {
    private final Input input;
    private final Student student;

    public StudentServiceImpl(Input input, Student student) {
        this.input = input;
        this.student = student;
    }

    @Override
    public Student createNewStudent() {
        student.setFirstName(input.askStr("Enter name: "));
        student.setLastName(input.askStr("Enter surname: "));
        student.setFinalScore(0);
        return student;
    }
}



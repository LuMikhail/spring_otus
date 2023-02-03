package otus.spring.homework.hm1.dao;

import otus.spring.homework.hm1.domain.Student;

public class CreateStudent implements UserStudent {
    private final Input input;

    public CreateStudent(Input input) {
        this.input = input;
    }

    @Override
    public Student addStudent(Student student) {
        student.setFirstName(input.askStr("Enter name: "));
        student.setLastName(input.askStr("Enter surname: "));
        student.setFinalScore(0);
        return student;
    }
}



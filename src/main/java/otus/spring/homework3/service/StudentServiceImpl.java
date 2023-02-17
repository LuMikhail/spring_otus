package otus.spring.homework3.service;

import org.springframework.stereotype.Service;
import otus.spring.homework3.dao.Input;
import otus.spring.homework3.domain.Student;
import otus.spring.homework3.service.locale.LocaleStudent;

@Service
public class StudentServiceImpl implements StudentService {
    private final Input input;
    private final Student student;
    private final LocaleStudent localeStudent;

    public StudentServiceImpl(Input input, Student student, LocaleStudent localeTest) {
        this.input = input;
        this.student = student;
        this.localeStudent = localeTest;
    }

    @Override
    public Student createNewStudent() {
        student.setFirstName(input.askStr(localeStudent.getLocaleFirstName()));
        student.setLastName(input.askStr(localeStudent.getLocaleSurname()));
        student.setFinalScore(0);
        return student;
    }
}



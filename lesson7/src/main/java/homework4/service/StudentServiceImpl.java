package homework4.service;

import homework4.dao.Input;
import homework4.domain.Student;
import homework4.service.locale.LocaleStudent;
import org.springframework.stereotype.Service;

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



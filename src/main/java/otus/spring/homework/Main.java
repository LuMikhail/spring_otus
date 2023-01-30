package otus.spring.homework;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import otus.spring.homework.domain.TestContaints;
import otus.spring.homework.service.TestService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        TestService service = context.getBean(TestService.class);
        List<TestContaints> test = service.getByAll("test_student.csv");
        System.out.println("Take the test on the basic sql commands and answer the questions:");
        test.forEach(x -> System.out.printf("%s \nChoose one correct answer: \n\t%s\n", x.getQuestion(), x.getAnswers()));
    }
}

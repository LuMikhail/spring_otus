package otus.spring.homework.hm1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import otus.spring.homework.hm1.domain.TestDomain;
import otus.spring.homework.hm1.service.TestService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context1.xml");
        TestService service = context.getBean(TestService.class);
        List<TestDomain> test = service.getByAll("test_student1.csv");
        System.out.println("Take the test on the basic sql commands and answer the questions:");
        test.forEach(x -> System.out.printf("%s \nChoose one correct answer: \n\t%s\n", x.getQuestion(), x.getAnswers()));
    }
}

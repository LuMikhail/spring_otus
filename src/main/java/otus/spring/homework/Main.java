package otus.spring.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import otus.spring.homework.domain.TestContaints;
import otus.spring.homework.service.TestService;

import java.util.List;

@ComponentScan
public class Main {
    public static void main(String[] args) {
       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        TestService service = context.getBean(TestService.class);
        List<TestContaints> test = service.getByAll("test_student.csv");
        System.out.println("Take the test on the basic sql commands and answer the questions:");
        test.forEach(x -> System.out.printf("%s \nChoose one correct answer: \n\t%s\n",
                x.getQuestion(), x.getAnswers()));
    }
}

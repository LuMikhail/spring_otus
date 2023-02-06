package otus.spring.homework.hm2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import otus.spring.homework.hm2.service.TestService;
import otus.spring.homework.hm2.service.TestServiceImpl;

@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        TestService service = context.getBean(TestServiceImpl.class);
        service.runTest();
    }
}

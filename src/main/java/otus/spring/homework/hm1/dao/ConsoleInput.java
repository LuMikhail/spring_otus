package otus.spring.homework.hm1.dao;

import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class ConsoleInput implements Input{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}

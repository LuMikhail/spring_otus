package otus.spring.homework2.dao;

public class SourceNotFoundException extends RuntimeException {

    public SourceNotFoundException(String mesege, Exception e) {
        super(mesege, e);
    }
}

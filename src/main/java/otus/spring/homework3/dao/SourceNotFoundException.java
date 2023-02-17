package otus.spring.homework3.dao;

public class SourceNotFoundException extends RuntimeException {

    public SourceNotFoundException(String mesege, Exception e) {
        super(mesege, e);
    }
}

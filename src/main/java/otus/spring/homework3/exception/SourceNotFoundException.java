package otus.spring.homework3.exception;

public class SourceNotFoundException extends RuntimeException {

    public SourceNotFoundException(String mesege, Exception e) {
        super(mesege, e);
    }
}

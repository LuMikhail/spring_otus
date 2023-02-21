package homework4.exception;

public class SourceNotFoundException extends RuntimeException {

    public SourceNotFoundException(String mesege, Exception e) {
        super(mesege, e);
    }
}

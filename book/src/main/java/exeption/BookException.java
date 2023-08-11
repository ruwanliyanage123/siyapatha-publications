package exeption;

public class BookException extends Exception{
    public BookException(Throwable throwable, String message){
        super(message, throwable);
    }

    public BookException(String message){
        super(message);
    }
}

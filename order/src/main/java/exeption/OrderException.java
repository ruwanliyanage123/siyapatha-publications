package exeption;

public class OrderException extends Exception{
    public OrderException(Throwable throwable, String message){
        super(message, throwable);
    }

    public OrderException(String message){
        super(message);
    }
}

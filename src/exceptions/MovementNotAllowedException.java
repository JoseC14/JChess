package exceptions;

public class MovementNotAllowedException extends RuntimeException{

    public MovementNotAllowedException(String msg)
    {
        super(msg);
    }
}

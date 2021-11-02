package practice.lessons.exception.custom;

//User Defined Exception
//Un-checked Exception
public class DivisorException extends RuntimeException {

    public DivisorException(String message){
        super(message);
    }

}

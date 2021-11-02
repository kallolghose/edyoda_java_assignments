package practice.lessons.exception.custom;

//Checked User Defined Exception
public class DivisorCheckedException extends Exception {

    public DivisorCheckedException(String message){
        super(message);
    }

}

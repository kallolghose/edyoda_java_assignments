package practice.lessons.exception;

import practice.lessons.exception.custom.DivisorCheckedException;
import practice.lessons.exception.custom.DivisorException;

public class ThrowExample {

    //divisor > 0 (Non-Zero, Non-Negative Number) || All Positive integers
    //If the divisor is <=0 raise an Exception
    public double divideByWholeNumber(int dividend, int divisor){
        if(divisor <= 0)
            throw new DivisorException("Divisor is <= 0");
        return dividend/divisor;
    }

    public double divideByWholeNumberCheckedException(int dividend, int divisor) {
        try {
            if (divisor <= 0)
                throw new DivisorCheckedException("Divisor is <= 0");
            return dividend / divisor;
        }
        catch (DivisorCheckedException divisorCheckedException){
            System.out.println("Exception : Divisor not proper");
        }
        return 0.0D;
    }

    public static void main(String[] args) throws DivisorCheckedException {
        ThrowExample throwExample = new ThrowExample();
        double result = throwExample.divideByWholeNumberCheckedException(100, -10);
        System.out.println("Result : " + result);
    }


}

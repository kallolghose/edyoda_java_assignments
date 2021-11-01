package practice.lessons.exception;

public class ExceptionUnderstanding {

    public int divideByZero(){
        int div = 4/0; //UNCHECKED or RUNTIME (Not detected while compiling)
        return div;
    }

    public void computeDivision(){
        System.out.println("Compute Division");
        int result = divideByZero();
        System.out.println("Result : " + result);
    }

    public static void main(String[] args) {
        System.out.println("MAIN Started");
        ExceptionUnderstanding exceptionUnderstanding = new ExceptionUnderstanding();
        exceptionUnderstanding.computeDivision();
        System.out.println("MAIN Ended");
    }

}

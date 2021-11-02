package practice.lessons.exception;

public class FinallyExample {

    public void finallyCode(){
        try{
            int result = 10/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception raised 1 : " + e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Exception raised 2 : " + e.getMessage());
            System.exit(0);
        }
        finally {
            //Finally block being called
            //1. When try block raised an exception which was NOT handled
            //2. When try block raised an exception which was handled
            //3. Finally Block is NOT called when u mention System.exit(0) either in try or catch block
            System.out.println("Finally block will be called always");
        }
    }

    public static void main(String[] args) {
        FinallyExample finallyExample = new FinallyExample();
        finallyExample.finallyCode();
        System.out.println("Main End");
    }

}

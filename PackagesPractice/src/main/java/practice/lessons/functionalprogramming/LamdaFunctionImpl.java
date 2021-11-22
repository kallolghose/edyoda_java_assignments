package practice.lessons.functionalprogramming;

public class LamdaFunctionImpl implements LamdaFunction {

    @Override
    public void call(String name) {
        System.out.println("Hello " + name);
    }

}

package practice.lessons.functionalprogramming;

@FunctionalInterface
public interface LamdaFunction {

    void call(String name);

    //From Java 8 onwards
    default void defaultFunc(){
        System.out.println("Default Func");
    }

}

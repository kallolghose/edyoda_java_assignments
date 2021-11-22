package practice.lessons.functionalprogramming;

public class MainLamda {

    public static void main(String[] args) {
        LamdaFunction lamdaFunction = (n1) -> System.out.println("Hello " + n1);
        lamdaFunction.call("Somesh");
        lamdaFunction.defaultFunc();

    }
}

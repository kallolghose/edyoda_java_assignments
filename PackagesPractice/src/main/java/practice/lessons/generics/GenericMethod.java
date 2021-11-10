package practice.lessons.generics;

public class GenericMethod {

    //Generic Method
    public static <T> void print(T param){
        System.out.println("Print : " + param.toString());
    }

    public static void main(String[] args) {
        GenericMethod.print("Kallol"); //String
        GenericMethod.print(10); //Integer

    }

}

package practice.lessons.generics;

public class GenericInterfaceImpl<T> implements GenericInterface<T>{

    @Override
    public void print(T variable) {
        System.out.println("Print Value : " + variable.toString());
    }
}

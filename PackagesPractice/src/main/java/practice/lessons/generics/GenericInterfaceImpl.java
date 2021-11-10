package practice.lessons.generics;

public class GenericInterfaceImpl<T> implements GenericInterface<T>{

    @Override
    public void print(T t) {
        System.out.println("Print Value : " + t.toString());
    }
}

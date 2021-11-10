package practice.lessons.generics;

//Generic Class
public class FirstGeneric<T> {

    private T myParam; //String,
    private T [] arr;

    public FirstGeneric(T myParam, int numberOfElementsInArray){
        this.myParam = myParam; //T = raw type
        this.arr = (T[]) (new Object[numberOfElementsInArray]);
    }

    public T getMyParam() {
        return myParam;
    }

}

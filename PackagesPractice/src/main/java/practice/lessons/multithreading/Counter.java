package practice.lessons.multithreading;

public class Counter {

    private int c = 0;

    public synchronized void increment() {
        int old = c;
        c = old + 1;
    }

    public synchronized void decrement() {
        int old = c;
        c = old - 1;
    }

    public int value() {
        return c;
    }

}

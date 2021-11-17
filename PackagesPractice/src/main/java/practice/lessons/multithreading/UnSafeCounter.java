package practice.lessons.multithreading;

public class UnSafeCounter implements Runnable {

    private Counter counter;
    private Boolean increment;

    public UnSafeCounter(Counter counter, Boolean increment){
        this.counter = counter;
        this.increment = increment;
    }

    @Override
    public void run() {
        try {
            if (increment)
                counter.increment();
            else
                counter.decrement();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        for (int i=0; i<2; i++){
            Thread t = new Thread(new UnSafeCounter(counter, i == 0));
        }
        Thread.sleep(5000);
        System.out.println(counter.value());
    }

}

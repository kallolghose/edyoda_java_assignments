package practice.lessons.multithreading;

public class MultiThreadRunnableExample {

    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            Thread thread = new Thread(new ThreadRunnable());
            thread.start();
        }
    }

}

class ThreadRunnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread " +
                    Thread.currentThread().getId() + " is running");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}

package practice.lessons.multithreading;

public class MultiThreadExample extends Thread {

    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            MyThread myThread = new MyThread();
            myThread.start();
        }
    }
}
class MyThread extends Thread {
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

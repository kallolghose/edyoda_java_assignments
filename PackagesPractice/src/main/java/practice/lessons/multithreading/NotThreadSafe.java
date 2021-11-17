package practice.lessons.multithreading;

import java.util.ArrayList;
import java.util.List;

public class NotThreadSafe {

    public static void main(String[] args) throws Exception{
        List<String> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            Thread t = new Thread(new NotSafeThread(list));
            t.start();
//            NotSafeThread notSafeThread = new NotSafeThread(list);
//            notSafeThread.run();
        }
        System.out.println(list.size());
        System.out.println(list);
    }

}

class NotSafeThread implements Runnable {

    private List<String> list;

    public NotSafeThread(List<String> list){
        this.list = list;
    }

    @Override
    public void run() {
        list.add("first");
        list.add("second");
    }

}

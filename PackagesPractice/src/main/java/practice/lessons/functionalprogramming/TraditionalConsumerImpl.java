package practice.lessons.functionalprogramming;

import java.util.function.Consumer;

public class TraditionalConsumerImpl implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }

}

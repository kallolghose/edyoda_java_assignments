package practice.lessons.nestedclass;

public class AnnonymousMain {

    public static void main(String[] args) {

        AnnonymousInterface annonymousInterface = new AnnonymousInterface() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }

            @Override
            public int multiply(int a, int b) {
                return a * b;
            }
        };

    }

}

package practice.lessons.constructorchaining;

//chaining within same class
public class Chaining {

    private int a, b, c;

    //(1) Initializing data member a
    public Chaining(int a1){
        a = a1;
        System.out.println("Constructor1");
    }

    //(2) Initializing data member a and b
    public Chaining(int a1, int b1){
        this(a1);
        this.b = b1;
        System.out.println("Constructor2");
    }

    //(3) Initializing data member a, b and c
    public Chaining(int a1, int b1, int c1){
        this(a1, b1);
        this.c = c1;
        System.out.println("Constructor3");
    }


    public void printValues(){
        System.out.println("A : " + this.a + ", B : " + this.b + ", C : " + this.c);
    }





}

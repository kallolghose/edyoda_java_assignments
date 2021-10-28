package practice.lessons.staticlesson;

public class StaticLesson {

    private static int var1; //Static Variable | Shared resource, data member
    private int var2;

    static {
        //It is the first point of execution
        var1 = 0;
    }

    public StaticLesson(int var2){
        this.var2 = var2;
    }

    public void increaseStaticVarBy1(){
        var1 = var1 + 1;
    }

    //U can use STATIC Member inside a NON-STATIC Function
    public void print(){
        System.out.println("Static : " + var1);
        System.out.println("Non - Static : " + var2);
    }

    //You cannot use NON-STATIC member (Data/Member function) inside STATIC Function
    //Static Member Function
    public static void decreaseStaticVarBy1(){
        var1 = var1 - 1;
    }
}

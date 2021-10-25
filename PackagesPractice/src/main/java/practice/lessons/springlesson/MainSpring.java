package practice.lessons.springlesson;

public class MainSpring {

    public static void main(String[] args) {
        String str1 = "Hello Java !!";
        String str2 = "Hello World !!";

        String str3 = null;

        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);

        //Whenever you are comparing non-primitive datatype variable DONOT use ==
        //And always use the equals function

        if(str1.equals(str2)){
            str3 = "Same";
        }
        else{
            str3 = "Not Same";
        }
        System.out.println("String 3 : " + str3);


    }

}

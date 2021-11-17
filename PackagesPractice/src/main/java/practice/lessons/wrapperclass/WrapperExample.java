package practice.lessons.wrapperclass;

public class WrapperExample {

    public static void main(String[] args) {
        int data = 10;
        double dData = 20.0002;

        Integer dataObject = data; //Auto Boxing
        System.out.println(dataObject);

        //Integer improperSyntax = dData;

        Double doubleWrapper = new Double(dData); //NOT Auto Boxing
        System.out.println(doubleWrapper);

        Float floatWrapper = 1000.0001F;

        String floatWrapperString = floatWrapper.toString();
        System.out.println("String :: " + floatWrapperString + ", Length Being : " + floatWrapperString.length());
        System.out.println("String :: " + floatWrapperString + ", Length Being : " + (floatWrapperString + "hello"));

        float fData = floatWrapper; //Unboxing
        double ddData = floatWrapper; //Proper Syntax

        float fData2 = floatWrapper.floatValue(); //NOT Unboxing
    }

}

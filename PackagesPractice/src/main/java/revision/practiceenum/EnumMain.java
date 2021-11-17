package revision.practiceenum;

import practice.lessons.enums.Color;
import practice.lessons.enums.Fruit;

public class EnumMain {

    public static Fruit getEnum(){
        return Fruit.ORANGE;
    }

    public static void main(String[] args) {
//        Color pinkEnumVar = Color.PINK;
//        System.out.println(pinkEnumVar.name());
//        System.out.println(pinkEnumVar.ordinal());
//        System.out.println(pinkEnumVar.getColorCode());



        System.out.println(Fruit.APPLE.name());
        System.out.println(Fruit.APPLE.ordinal());
        System.out.println(Fruit.APPLE.getPrice());

        if(getEnum().equals(Fruit.APPLE)){
            System.out.println("Enum fetched is APPLE");
        }
        else{
            System.out.println("Enum fetched is NOT apple");
        }

        switch (getEnum()){
            case APPLE:
                System.out.println("This is apple");
                break;
            case ORANGE:
                System.out.println("This is orange");
                break;
            case GRAPES:
                System.out.println("This is Grapes");

        }

    }
}

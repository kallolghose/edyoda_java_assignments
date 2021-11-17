package practice.lessons.enums;

public enum Fruit {

    ORANGE(10),//0
    APPLE(20), //1
    GRAPES(50); //2

    //Storing additional property value
    private Integer price;

    //Additional Property
    public Integer getPrice(){
        return this.price;
    }

    //Construction to initialize any additional property value
    Fruit(Integer price){
        this.price = price;
    }


}

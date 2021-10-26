package practice.lessons.constructorchaining;

public class Animal {

    public String classOfAnimal;
    public String bloodType;

    public Animal(String classOfAnimal, String bloodType){
        this.classOfAnimal = classOfAnimal;
        this.bloodType = bloodType;
        System.out.println("Base Constructor");
    }

}

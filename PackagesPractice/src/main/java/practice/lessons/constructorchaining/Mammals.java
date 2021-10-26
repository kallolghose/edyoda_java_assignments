package practice.lessons.constructorchaining;

public class Mammals extends Animal {

    public String legged;

    public Mammals(String classOfAnimal, String bloodType, String legged){
        super(classOfAnimal, bloodType);
        this.legged = legged;
        System.out.println("Child Constructor");
    }

}

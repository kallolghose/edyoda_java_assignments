package practice.lessons.constructorchaining;

//Child class
public class Mammals extends Animal {

    public String legged;

    public Mammals(String classOfAnimal, String bloodType, String legged){
        super(classOfAnimal, bloodType); //Used to call base class cons
        this.legged = legged;
        System.out.println("Child Constructor");
    }

    public void eating(){

    }

}

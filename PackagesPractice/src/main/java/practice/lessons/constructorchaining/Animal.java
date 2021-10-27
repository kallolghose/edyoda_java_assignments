package practice.lessons.constructorchaining;


import practice.lessons.inheritancenew.Son;

//Parent Class
public class Animal {

    public String classOfAnimal;
    public String bloodType;
    private Son son;

    public Animal(String classOfAnimal, String bloodType){
        this.classOfAnimal = classOfAnimal;
        this.bloodType = bloodType;
        System.out.println("Base Constructor");
    }

}

package practice.lessons.constructorchaining;

public class MainChainingInheritance {
    public static void main(String[] args) {
        Animal newAnimal = new Animal("some", "someType");
        Mammals animal = new Mammals("reptilia", "cold blooded", "4-legged");
        animal.eating();
    }

}

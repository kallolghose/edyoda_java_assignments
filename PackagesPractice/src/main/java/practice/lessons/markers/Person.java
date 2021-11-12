package practice.lessons.markers;

public class Person implements Cloneable {

    private String fullName;
    private int age;

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void print(){
        System.out.println(String.format("Name : %s, Age : %d", getFullName(), getAge()));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Kallol", 29);
        Person p2 = (Person) person.clone();

        person.setFullName("Ghose");
        System.out.println("Person");
        person.print();

        System.out.println("P2");
        p2.print();
    }
}

package practice.lessons.copy;

public class Person {

    private Name name;
    private Address address;

    public Person(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    //I want to copy Name and Address from another Person Object
    //shallow copy
//    public Person(Person copyFromPerson){
//        this.name = copyFromPerson.getName();
//        this.address = copyFromPerson.getAddress();
//    }

    //Deep Copy
    public Person(Person copyFromPerson){
        this.name = new Name(copyFromPerson.getName().getFirstName(), copyFromPerson.getName().getLastName());
        this.address = new Address(copyFromPerson.getAddress().getLine(), copyFromPerson.getAddress().getPincode());
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void print(){
        this.name.print();
        this.address.print();
    }
}

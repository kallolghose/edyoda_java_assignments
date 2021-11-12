package practice.lessons.copy;

public class CopyMain {

    public static void main(String[] args) {
        Name name = new Name("Kallol", "Ghose");
        Address address = new Address("Shillong, Megh", 793006);
        Person kallol = new Person(name, address);
        kallol.print();

        System.out.println("Copy ================= ");

        Person kallol_copy = new Person(kallol);
        kallol_copy.print();
        System.out.println(" ::::::: Update Copy Address :::::::::::: ");
        kallol_copy.getAddress().setLine("Noida, UP");
        kallol_copy.getAddress().setPincode(201301);
        kallol_copy.print();

        System.out.println("Original ===============");
        kallol.print();
    }

}

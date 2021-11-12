package practice.lessons.markers;

import java.io.*;

public class Address implements Serializable {

    private String line1;
    private String line2;
    private Integer pincode;
    private String country;

    public Address(String line1, String line2, String country, Integer pincode) {
        this.line1 = line1;
        this.line2 = line2;
        this.country = country;
        this.pincode = pincode;
    }

    public void print() {
        System.out.println(
                String.format("Line 1 : %s, Line 2 : %s, Country : %s, Pincode : %d", line1, line2, country, pincode));
    }

    public static void main(String[] args) throws Exception {
        //Serialize Object --> File
//        Address address = new Address("Shillong", "Meghalaya", "India", 793006);
//        address.print();
//        FileOutputStream fos =
//                new FileOutputStream("C:\\Users\\Hp\\OneDrive\\Documents\\workspace\\edYoda\\temp_folder\\serialize.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(address);
//        oos.close();

        //De-Serialize File --> Object
        FileInputStream fis =
                new FileInputStream("C:\\Users\\Hp\\OneDrive\\Documents\\workspace\\edYoda\\temp_folder\\serialize.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Address address1 = (Address) ois.readObject();
        System.out.println("Address read from file::::");
        address1.print();
        ois.close();
    }
}

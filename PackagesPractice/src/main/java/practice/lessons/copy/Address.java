package practice.lessons.copy;

public class Address {

    private String line;
    private Integer pincode;

    public Address(String line, Integer pincode) {
        this.line = line;
        this.pincode = pincode;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public void print(){
        System.out.println(String.format("Address : %s, %d", line, pincode));
    }
}

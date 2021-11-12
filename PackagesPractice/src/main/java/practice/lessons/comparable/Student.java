package practice.lessons.comparable;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private double percentage;

    public Student(String name, int age, double percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPercentage() {
        return percentage;
    }

    public void print(){
        System.out.println(String.format("Name : %s, Age : %d, Percentage %f", name, age, percentage));
    }

    /**
     * Compare using age
     * positive integer, if the current object is greater than the specified object.
     * negative integer, if the current object is less than the specified object.
     * zero, if the current object is equal to the specified object.
     * @param other
     * @return
     */
    @Override
    public int compareTo(Student other) {
        return this.getAge() - other.getAge();
    }
}

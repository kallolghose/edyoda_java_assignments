package practice.lessons.comparable;

import java.util.Comparator;

public class PercentageComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return (int)(firstStudent.getPercentage() - secondStudent.getPercentage());
    }
}

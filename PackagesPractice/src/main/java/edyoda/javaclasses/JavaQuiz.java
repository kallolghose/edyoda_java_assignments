package edyoda.javaclasses;

import com.edyoda.classroom.Curriculum;
import com.edyoda.classroom.Planner;

public class JavaQuiz {

    public static void main(String[] args) {
        Curriculum curriculum = new Curriculum();
        curriculum.createTest();

        Planner planner = new Planner();
        planner.createPlanner();
    }
}

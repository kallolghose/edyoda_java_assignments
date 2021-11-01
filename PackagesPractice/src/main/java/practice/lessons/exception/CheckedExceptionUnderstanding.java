package practice.lessons.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptionUnderstanding {

    //Compile Time Exception | Checked Exception (Detected while compiling)
    //throws will be residing along with the function declaration
    public void readFileUsingThrows() throws FileNotFoundException {
        File file = new File("C:\\Users\\Hp\\OneDrive\\Documents\\Kallol Documents\\teaching\\edYoda\\DS Questions11.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public void readFileUsingTryCatch() {
        File file = new File("C:\\Users\\Hp\\OneDrive\\Documents\\Kallol Documents\\teaching\\edYoda\\DS Questions11.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
        catch (Exception exception) {
            System.out.println(" ============== File was not Found ... =============== ");
        }
    }

    public void throwsExample() throws FileNotFoundException {
        System.out.println("Throws Example");
        readFileUsingThrows();
        System.out.println("2. After");
    }

    public void tryCatchExample() {
        System.out.println("Try Catch Example");
        readFileUsingTryCatch();
        System.out.println("Try Catch After");
    }

    public static void main(String[] args) {
        System.out.println("In Main");
        CheckedExceptionUnderstanding checkedExceptionUnderstanding = new CheckedExceptionUnderstanding();
        checkedExceptionUnderstanding.tryCatchExample();
        System.out.println("Main End");
    }

}

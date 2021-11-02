package practice.lessons.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Revision {

    //One can handle both checked and unchecked exceptions
    //Checked exceptions is mandatory to handle or else compilation fails
    //Unchecked exceptions are not mandatory to handle
    public static void main(String[] args) {
        try {
            File file = new File("FileLocaltion");
            Scanner scanner = new Scanner(file);
        }
        catch (FileNotFoundException exception){

        }
    }
}

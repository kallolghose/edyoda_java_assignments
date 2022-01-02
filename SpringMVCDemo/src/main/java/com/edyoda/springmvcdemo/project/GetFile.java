package com.edyoda.springmvcdemo.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetFile {

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
        System.out.println("End of Main");
    }

//    public static void readFile(){
//        try {
//            File file = new File("asdkjas.txt");
//            Scanner scanner = new Scanner(file);
//            System.out.println(scanner.nextLine());
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//            System.out.println("File WAS NOT FOUND");
//        }
//    }

        public static void readFile() throws FileNotFoundException {

            File file = new File("asdkjas.txt");
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.nextLine());

    }


}

package practice.lessons.multithreading;

import java.io.File;
import java.util.*;

public class WordCount extends Thread {

    private String fileName;
    private Set<String> words;

    @Override
    public void run() {
        readFile(fileName, words);
    }

    public WordCount(String fileName, Set<String> words){
        this.fileName = fileName;
        this.words = words;
    }

    public void readFile(String fileName, Set<String> words){
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()){
                words.add(scanner.next());
            }
            System.out.println("Done Reading : " + fileName);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Set<String> words = Collections.synchronizedSet(new HashSet<>());
        List<String> allFileNames = new ArrayList<String>() {{
            add("C:\\Users\\Hp\\OneDrive\\Documents\\workspace\\edYoda\\java\\Thread_Folder\\First.txt");
            add("C:\\Users\\Hp\\OneDrive\\Documents\\workspace\\edYoda\\java\\Thread_Folder\\Second.txt");
            add("C:\\Users\\Hp\\OneDrive\\Documents\\workspace\\edYoda\\java\\Thread_Folder\\Third.txt");
        }};
        long startTime = System.currentTimeMillis();
        for (String fileName : allFileNames){
            WordCount wordCount = new WordCount(fileName, words);
            wordCount.start();
            wordCount.join();
        }
        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;
        System.out.println("Size : " + words.size());
        System.out.println("Time taken : " + elapsed);
    }

}

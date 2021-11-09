package practice.lessons.collections;

import java.util.*;

public class CollectionMaps {

    public static void main(String[] args) {
        Map<String, String> rollNumberNames = new HashMap<>();
        rollNumberNames.put("001", "Amit");
        rollNumberNames.put("002", "Sai");
        rollNumberNames.put("003", "Lavanya");
        rollNumberNames.put("004", "Srilekha");
        rollNumberNames.put("005", "Aditya");
        System.out.println("Map : " + rollNumberNames);
        System.out.println("Size of Map : " + rollNumberNames.size());
        System.out.println("006 Exists : " + rollNumberNames.containsKey("006"));
        rollNumberNames.remove("002");
        System.out.println("Map : " + rollNumberNames);

        //Iterate
        Iterator<String> keyIterator = rollNumberNames.keySet().iterator();
        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            System.out.println("Key : " + key + ", Value : " + rollNumberNames.get(key));
        }

        System.out.println("Entry Traversal");
        for (Map.Entry<String, String> entry : rollNumberNames.entrySet()){
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }


    }

}

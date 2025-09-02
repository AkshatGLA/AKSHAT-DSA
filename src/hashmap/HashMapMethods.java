package hashmap;
import java.util.*;
public class HashMapMethods {
    public static void hashMapMethods(){
        Map<String, Integer> mp=new HashMap<>();
        mp.put("Akash",21);
        mp.put("Amit",22);
        mp.put("akshat", 12);
        System.out.println(mp.get("Akash"));
        System.out.println(mp.get("A")); // null
        // get will retrurn null if the key is not present in the map

        mp.put("akash", 23); // it will override the value of key akash
        System.out.println(mp.get("akash")); // 23
        // if we want to check whether the key is present in the map or not
        
        // remove method
        mp.remove("Akash");
        System.out.println(mp.get("Akash")); // null
        // if we want to check whether the key is present in the map or not
        System.out.println(mp.remove("Amit")); // 22
        System.out.println(mp.get("Amit")); // null

        // containsKey method
        System.out.println(mp.containsKey("Akash")); // false
        System.out.println(mp.containsKey("akshat")); // true

        // putIfAbsent method
        mp.putIfAbsent("Akash", 21); // it will not override the value of key Akash
        System.out.println(mp.get("Akash")); // 21
        // it will not override the value of key akash

        // get all keys
        System.out.println(mp.keySet()); // [akshat, akash]

        // get all values   
        System.out.println(mp.values()); // [12, 23]

        // get all entries
        System.out.println(mp.entrySet()); // [akshat=12, akash=23]

        // traversing all enteries of hashmap
        for(String key: mp.keySet()){
            System.out.println(key + " " + mp.get(key));
        }
        System.out.println("-----------------");
        for(Map.Entry<String, Integer> entry: mp.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("-----------------");

        // for(var e:mp.entrySet()){
        //     System.out.println(e.getKey() + " " + e.getValue());
        // }
    }
    public static void main(String[] args) {
        hashMapMethods();
    }
}

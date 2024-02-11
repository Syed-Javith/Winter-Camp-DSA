package Hashing.ClassProblems;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
   public static void main(String[] args) {
    HashMap<Integer,Integer> map = new HashMap<>();

    // put(key,value) to insert the element
    map.put(1, 0);
    map.put(2, 1);

    //get(key) to get the value
    System.out.println(map.get(1));

    //for looping use entrySet() , keySet() , values()
    for(Map.Entry m : map.entrySet()){
        System.err.println( m.getKey() + " " + m.getValue());
    }

    // containsKey(key) returns whether the key is present or not
    if(map.containsKey(1)){
        System.out.println("1 is present");
    }

    // To iterate key use keySet()
    for(int key : map.keySet()){
        System.err.print(key + " ");
    }
    System.out.println();
    // To iterate values use values()
    for(int value : map.values()){
        System.err.print(value + " ");
    }
    
   } 
}

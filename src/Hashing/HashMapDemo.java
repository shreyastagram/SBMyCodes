package Hashing;
import java.util.HashMap;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args){
        //not synchronized
        HashMap<String,Integer> map=new HashMap<>();

        map.put("Shreyash",24);
        map.put("Suresh",24);
        map.put("Borkar",43);
        System.out.println(map.entrySet());

        HashMap<String,ArrayList<String>> contactList=new HashMap<>();
        contactList.put("Shreyash",new ArrayList<>());
        contactList.get("Shreyash").add("9146282497");
        contactList.get("Shreyash").add("9665428081");
        System.out.println(contactList.entrySet());
    }
}

package Hashing;
import java.util.Hashtable;
public class HashTableDemo {
    public static void main(String[] args) {
        //synchronized
        Hashtable<String, Integer> h = new Hashtable<>();
        h.put("Aman", 23);
        h.put("Shreyash",24);
        h.put("Suresh",65);
        h.put("Aman",45);
        System.out.println(h);
        System.out.println(h.get("Shreyash"));
        System.out.println(h.entrySet());



    }
}


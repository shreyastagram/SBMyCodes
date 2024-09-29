package Hashing;
import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args){
        HashSet<String> set=new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Lily");
        System.out.println(set);
        set.remove("Apple");
        System.out.println(set);
    }
}

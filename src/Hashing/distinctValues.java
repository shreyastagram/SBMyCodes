package Hashing;
import java.util.HashMap;
import java.util.Scanner;
public class distinctValues {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key;
        String value;
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < n; i++) {
            key = sc.nextInt();
            value = sc.next();
            if (!h.containsValue(value)) {
                h.put(key, value);
                result.append(value).append(" ");
            }
        }
        System.out.println(result);
    }
}

package Hashing;
import java.util.HashMap;
public class firstUniqueCharacter {
    public static void main(String[] args) {
        HashMap<Character, Integer> mapp = new HashMap<>();
        String str = "abccdebaf";
        for (int i = 0; i < str.length(); i++) {
            mapp.put(str.charAt(i), mapp.getOrDefault(str.charAt(i), 0) + 1);
        }
        char firstUniqueCharacter='\0';
        for (int i = 0; i < str.length(); i++) {
            if (mapp.get(str.charAt(i)) == 1) {
                firstUniqueCharacter = str.charAt(i);
                break;
            }
        }
        if (firstUniqueCharacter!='\0'){
            System.out.println(firstUniqueCharacter);
    }
        else{
            System.out.println("No Unique Character Found");
        }
    }
}

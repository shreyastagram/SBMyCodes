package basic;
import java.util.*;
public class QueuePaliChk {//BIG O= O(n2)
    public static void main(String[] args) {
        QueuePaliChk obj=new QueuePaliChk();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        obj.paliCheck(inputString);
    }

    public void paliCheck(String inputString) {
        Queue<Character> q = new LinkedList<Character>();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            q.add(inputString.charAt(i));
        }
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != q.remove()) {
                System.out.println("The given String is not a palindrome");
                return;
            }
        }
                System.out.println("The given String is a palindrome");
        }
    }

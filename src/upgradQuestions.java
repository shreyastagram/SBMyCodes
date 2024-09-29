import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
public class upgradQuestions {
    public static void main(String[] args) {
        try {
            System.out.println(match("()()()"));
            System.out.println(match("()()()()))"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean match(String parens) throws Exception {
        int count = 0;
        char[] chars = parens.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count > 0) {
                    count--;
                } else {
                    return false;
                }
                ;
            } else {
                throw new Exception("Invalid Charecter");
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}
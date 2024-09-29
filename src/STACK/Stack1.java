package STACK;
import java.util.Scanner;
import java.util.*;

import java.util.Stack;

public class Stack1 {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            stack.push(sc.nextInt());
        }
        printFifth(stack);
    }


    static void printFifth(Stack<Integer> stack) {
        if (stack.size() < 5) {
            System.out.println("there are not enough lements in the stack");
        } else if (stack.size() >= 5) {
            int count = 0;
            Iterator<Integer> iterator = stack.iterator();
            while (iterator.hasNext()) {
                int element = iterator.next();
                count++;
                if (count == stack.size() - 4) {
                    System.out.println(element);
                    return;
                }

            }

        }
    }
}

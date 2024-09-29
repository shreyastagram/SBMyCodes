package Algorithms;
import java.util.Scanner;

public class algorithmFirst {
    public static void main(String[] args) {
        System.out.println("Enter the fibonacci number to be generated");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        algorithmFirst recurse = new algorithmFirst();
        int number = recurse.fibonacci(n);
        System.out.println("The Fibonacci number is :- " + number);
    }


    public int fibonacci(int n) {
            if (n < 2) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2) % 10;
            }
        }
    }

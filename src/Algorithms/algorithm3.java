package Algorithms;
import java.util.Scanner;
public class algorithm3 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        algorithm3 algo=new algorithm3();
        System.out.println(algo.fibonacci(n));
    }
    public int fibonacci(int n){
        int a=0;
        int b=1;
        int c=n;
        for(int i=2;i<=n;i++){
            c=(a+b);
            a=b;
            b=c;
        }
        return c ;
    }
}

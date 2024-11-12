package practice;

public class Digitproduct {
    public static void main(String[] args){
        int ans =product(505);
        System.out.println(ans);

    }
    static int product(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*product(n/10);
    }
}

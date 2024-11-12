package practice;

public class Fibo {
    public static void main(String[] args){
        int ans =fibo(50);
        System.out.println(ans);

    }
    static int fibo(int n){

        //base condition
        if(n<2){
            return n;
        }

        return fibo(n-2)+fibo(n-1);
    }
}

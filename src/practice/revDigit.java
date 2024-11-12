package practice;

public class revDigit {
    public static void main(String[] args){
        rev(1234);
        System.out.println(sum);

    }
    static int sum=0;
    static void rev(int n){
        if(n==0 ){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev(n/10);
    }
    static void rev2(int n){
        //sometimes you might need some additional variables in the argument it
        //in that case,make another function(helper function)


    }
}

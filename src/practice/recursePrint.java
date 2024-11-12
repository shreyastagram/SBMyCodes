package practice;

public class recursePrint {
    public static void main(String[] args){
        printBoth(5);

    }

    static void print(int n) {
        if(n==1){
            System.out.println(1);
            return;

        }

        System.out.println(n);//to print descending 5 to 1
        print(n-1);


    }
    static void printRev(int n){
        if(n==1){
            System.out.println(n);
            return;
        }


        printRev(n-1);
        System.out.println(n);

    }
    static void printBoth(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}

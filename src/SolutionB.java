import java.util.Scanner;

public class SolutionB {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m=sc.nextInt();
            int[] arr = new int[n+1];
            for (int i = 1; i < (n+1); i++) {
                arr[i] = sc.nextInt();
            }

            int result=bin(arr,m);
            if(result==-1){
                System.out.println("NOT_FOUND");
            }
            else{
                System.out.println(result);
            }
        }
    public static int bin(int[] arr,int m) {
        int start = 1;
        int end = getEndIndex(arr);
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == m) {
                return mid;
            } else if (arr[mid] < m) {
                start = mid + 1;
            } else if (arr[mid] > m) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int getEndIndex(int[] arr){
        int i=1;
        while(true){
            try{
            int temp=arr[i];
            i++;
        }
            catch(ArrayIndexOutOfBoundsException e){
                return i=i-1;
            }
            }
    }
}

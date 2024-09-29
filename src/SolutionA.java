import java.util.Scanner;

public class SolutionA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        bin(arr);
    }

    public static void bin(int[] arr) {
        int start = 1;
        int end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == mid) {
                System.out.println(mid);
                break;
            }
            else if (arr[mid] < mid) {
                start = mid + 1;
            }
            else if(arr[mid]>mid){
                end = mid - 1;
            }
            else {
                System.out.println("NOT_FOUND");
                break;
            }
        }

    }
}

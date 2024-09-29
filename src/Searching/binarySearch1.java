package Searching;


public class binarySearch1 {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12,14,16};

        System.out.println(bin(arr, 14));

    }

    public static int bin(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }


        }
        return -1;
    }
}

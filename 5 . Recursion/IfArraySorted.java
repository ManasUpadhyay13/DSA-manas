package Recursion;

public class IfArraySorted {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 0, 6, 7, 8, 9 };

        System.out.println(checkArray(arr, 0));

    }

    static boolean checkArray(int[] arr, int n) {
        if (n == arr.length - 2) {
            return true;
        }

        return (arr[n] < arr[n + 1]) && checkArray(arr, ++n);
    }
}
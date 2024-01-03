package Recursion;

public class LinerSerach {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 0, 6, 7, 8, 9 };

        System.out.println(find(arr, 0, 12));

    }

    static int find(int[] arr, int n, int k) {

        int i = -1;
        if (n == arr.length - 1)
            return i;

        i = arr[n] == k ? n : find(arr, ++n, k);

        return i;
    }
}

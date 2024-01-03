package Recursion;

public class RevANumber {
    public static void main(String[] args) {
        revNum(1232);
        System.out.println(sum);
    }

    static int sum = 0;

    static void revNum(int n) {
        if (n == 0) {
            return;
        }
        sum = (sum * 10) + (n % 10);
        revNum(n / 10);
    }
}

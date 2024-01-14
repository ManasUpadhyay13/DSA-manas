package Recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(findSum(4));
    }

    static int findSum(int n) {
        if (n % 10 == n)
            return n;
        return (n % 10) + findSum(n / 10);
    }
}

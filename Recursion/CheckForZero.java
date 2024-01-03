package Recursion;

public class CheckForZero {
    public static void main(String[] args) {
        checkForZero(10304000);
        System.out.println(numberOfZeros);
    }

    static int numberOfZeros = 0;

    static void checkForZero(int num) {
        if (num == 0)
            return;
        if (num % 10 == 0) {
            ++numberOfZeros;
        }
        checkForZero(num / 10);
    }
}

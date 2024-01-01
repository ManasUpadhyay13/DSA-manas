package Recursion;

public class P1to2 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(--n);
    }
}

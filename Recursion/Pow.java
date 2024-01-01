package Recursion;

public class Pow {
    public double myPowe(double x, int n) {
        if (n == 1) {
            return 2;
        }
        return (x * myPowe(x, --n));
    }

    public static void main(String[] args) {
        Pow obj = new Pow();
        System.out.println(obj.myPowe(2.0, 4));

    }
}

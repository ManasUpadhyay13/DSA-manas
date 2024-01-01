import java.util.Scanner;

public class funciton {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the first number : ");
        a = in.nextInt();
        System.out.print("Enter the second number : ");
        b = in.nextInt();
        System.out.println("\nThe sum of the two numbers is : " + sum(a, b));
        in.close();
    }

    static int sum(int a, int b)
    {
        return a+ b;
    }
}

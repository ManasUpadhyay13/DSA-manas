import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = input.nextInt();
        System.out.print("Enter the second number ");
        int b = input.nextInt();
        System.out.println("\nThe sum of the two numbers is : "+ (a+b));
        input.close();
    }
}

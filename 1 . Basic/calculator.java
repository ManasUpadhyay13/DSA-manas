import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // a progrma to demonstrate the working of a calculator

        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number ");
        a = input.nextInt();
        System.out.print("Enter the second number ");
        b = input.nextInt();
        System.out.println("\n\nYour options are : \n1 . Addition \n2 . Subtraction \n3 . Multiplication \n4.Division");
        System.out.print("\nEnter your choice : ");
        int choice = input.nextInt();
        if(choice == 1){
            System.out.println("\n\n" + a + " + " + b + " = " + (a+b));
        }
        else if(choice == 2){
            System.out.println("\n\n" + a + " - " + b + " = " + (a-b));
        }
        else if(choice == 3){
            System.out.println("\n\n" + a + " * " + b + " = " + (a*b));
        }
        else if(choice == 4){
            System.out.println("\n\n" + a + " / " + b + " = " + (a/b));
        }
        else{
            System.out.println("\n\nWrong choice entered");
        }
        input.close();
    }
}

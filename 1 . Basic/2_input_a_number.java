import java.util.Scanner;

class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string that you want to print : ");
        System.out.print(input.nextLine());
        input.close();
    }
}

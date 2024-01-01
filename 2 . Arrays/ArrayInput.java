import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0 ; i<5 ; i++){
            System.out.print("Enter the value of " + (i+1) + " element : " );
            a[i] = obj.nextInt();
        }
        System.out.print("\nThe value of the array is : \n");
        for (int i : a) {
                System.out.println(a[i]);
        }
        obj.close();
    }    
}
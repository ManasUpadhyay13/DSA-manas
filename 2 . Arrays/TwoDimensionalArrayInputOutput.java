import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrayInputOutput {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        // taking the input of the array 

        System.out.println("Enter the values of the array : ");

        Scanner input_obj = new Scanner(System.in);

        for(int row=0 ; row < arr.length ; row++ ){
            for(int col = 0 ; col < arr[row].length ; col++){
                arr[row][col] = input_obj.nextInt();
            }
        }

        // output of the array 

        System.out.println("\nThe values of the array are : ");

        for(int row=0 ; row < arr.length ; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        input_obj.close();
    }
}

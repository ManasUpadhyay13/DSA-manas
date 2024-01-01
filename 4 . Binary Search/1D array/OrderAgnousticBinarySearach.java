import java.util.Arrays;

//the main idea is that if we are given an array then we dont know if the order is arranged in ascesding or descing order so in order to check the order of the array we check the first and the last element and compare to find if the array is arranged in ascending or descing order.

public class OrderAgnousticBinarySearach {
    public static void main(String[] args) {
        int[] array = new int[5];
        int target ; 
        java.util.Scanner input_obj = new java.util.Scanner(System.in);

        System.out.println("\nKindly enter your array in any format that you want : ");

        for(int i = 0 ; i < array.length ; i++ ){
            array[i] = input_obj.nextInt();
        }


        // printing the array 
        System.out.print("\n\nThe array looks somewhat like this : ");
            System.out.println(Arrays.toString(array));
        

        // taking in the target to find in the array 

        System.out.print("\n\nEnter the number that you want to search in the array : ");
        target = input_obj.nextInt();

        // checking if the array is in ascending or descending order 

        if( array[0] < array[array.length-1]){
            // ascending order 
            System.out.println("\n\nThe place where the target element lies is : " + ascendingOrder(array , target));
        }
        else if( array[0] > array[array.length-1]){
            System.out.println("\n\nThe place where the target element lies is : " + descendingOrder(array , target));
        }
        else{
            System.out.println("\n\n\n The array is unicode.");
        }


        input_obj.close();
    }



    // code for ascending order 

    static int ascendingOrder(int[] array , int search){
        int start = 0;
        int end = array.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(search > array[mid]){
                start = mid+1;
            }
            else if( search > array[mid]){
                end = mid-1;
            }
            else{
                return array[mid];
            }
        }

        return -1;
    }



    // code for descding order 

    static int descendingOrder(int[] array , int search){
        int start = 0;
        int end = array.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(search < array[mid]){
                start = mid+1;
            }
            else if( search < array[mid]){
                end = mid-1;
            }
            else{
                return array[mid];
            }
        }

        return -1;
    }
}


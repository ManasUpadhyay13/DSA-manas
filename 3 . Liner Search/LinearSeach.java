public class LinearSeach {
    public static void main(String[] args) {
        
        int[] array = new int[10];

        java.util.Scanner input_obj = new java.util.Scanner(System.in);

        // inputting the array 

        System.out.println("Enter the values in the array : ");
        for(int i = 0 ; i < array.length ; i++){
            array[i] = input_obj.nextInt();
        }

        // Printing the array 

        System.out.println("\n\nYour array looks somewhat like this : ");
        System.out.println(java.util.Arrays.toString(array));


        // to search the element in the array 

        int search;

        System.out.print("\nEnter the value that you want to search in the array : ");
        search = input_obj.nextInt();


        linearSeach(array , search);

        input_obj.close();
    }

    static void linearSeach(int[] array , int search ){
        int check = 0 ;
        for(int i = 0 ; i < array.length ; i++ ){
            if(search == array[i]){
                System.out.println("\n\nThe item you where searching is present at the position " + (i+1) + " in the array");
                check++;
            }
        }
        if(check == 0){
            System.out.println("\n\nSorry the item you where seaching in the array is not found \n");
        }
    }
}

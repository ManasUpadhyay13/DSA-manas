public class LinerSearchIn2DArray {
    public static void main(String[] args) {
        
        int[][] array = {
            {1 , 2 , 3},
            {4 , 5 , 6},
            {7 , 8 , 9}
        };

        java.util.Scanner input_obj = new java.util.Scanner(System.in);
        System.out.print("Enter the number that you want to search : ");
        int search =  input_obj.nextInt();
        int find=0;

        for(int[] row : array){
            for(int col : row){
                if(search == col){
                    find++;
                }
            }
        }

        if(find == 0){
            System.out.println("\nThe number you where searching in the array is not present ");
        }else{
            System.out.println("\nThe number you where searching in the array is present");
        }

        input_obj.close();
        
    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        // making an 2D array list

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initializing the array list 

        for(int i = 0 ; i < 3 ; i++ ){
            list.add(new ArrayList<>());
        }

        // inputting the values of the list 

        for(int i = 0 ; i< 3 ; i++){
            for( int j = 0 ; j < 3 ; j++){
                list.get(i).add(in.nextInt());
            }
        }

        // printing the array list 

        for (ArrayList<Integer> l : list) {
            System.out.println(l);
        }

        in.close();
    }
}

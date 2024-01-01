import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // declaring an ArrayList

        ArrayList<Integer> list = new ArrayList<>();

        // to add the values in array list we use the add method 

        for(int i =0 ; i<5 ; i++){
            list.add(input.nextInt());
        }

        System.out.println(list);
        System.out.println(list.get(0));
        input.close();
    }
}

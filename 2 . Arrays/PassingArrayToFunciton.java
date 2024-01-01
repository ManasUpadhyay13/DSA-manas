import java.util.Arrays;

public class PassingArrayToFunciton {
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,7};
        System.out.println(Arrays.toString(arr));
        change(arr);
    }
    static void change(int[] arr){
        for (int i : arr) {
            System.out.println(i+2);
        }
    }
}

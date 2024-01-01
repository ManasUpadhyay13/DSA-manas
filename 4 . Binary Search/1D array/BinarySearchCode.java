// considering the array is sorted in ascending order

public class BinarySearchCode{
    public static void main(String[] args) {
        int[] array = { 1 , 2 , 3 , 4, 5, 6, 7, 8, 9 };
        int search = 11;

        int ans = BinarySearch(array, search);

        System.out.println(ans);

    }

    static int BinarySearch(int[] array , int search){
        int start = 0;
        int end = array.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(search > array[mid]){
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
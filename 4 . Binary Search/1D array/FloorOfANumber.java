// in this basically we have to find a number that is either equal to the given target element or is smaller than the given target element

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] array = { 1 , 2 , 3 , 5 , 7, 23 , 34 , 43 , 89 };
        int target = 13;
        int start = 0 ;
        int end = array.length - 1;

        System.out.println(findFloorNumber(array , target , start , end));

    }
    static int findFloorNumber(int[] array , int target , int start , int end){
        

        while( start < end ){
            int mid = ( start + end ) / 2;
            if(array[mid] == target){
                return array[mid];
            }
            else if( target > array[mid] ){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println(end );
        System.out.println(start);

        return array[end];
    }
}

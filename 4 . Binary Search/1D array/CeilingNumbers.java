public class CeilingNumbers{
    public static void main(String[] args) {

        int[] array = { 2 , 3 , 5 , 7, 23 , 34 , 43 , 89 };
        int target = 13;
        int start = 0 ;
        int end = array.length - 1;

        System.out.println(findCeilingNumber(array , target , start , end));

    }
    static int findCeilingNumber(int[] array , int target , int start , int end){
        

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
        return array[start];
    }
}



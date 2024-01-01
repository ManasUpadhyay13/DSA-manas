// the basic idea is that we have return a letter that is greater than the given target element. 
// the letters wrap around that is if there is not any character found in the array that is greter than the given target element , than we just simply return the first element of the array .

public class SmallestLetter {
    public static void main(String[] args) {
        
        char[] arr = {'a' , 'c' , 'f' , 'g'};
        char target = 'b';
        int start = 0;
        int end = arr.length-1;

        System.out.println(smallestLetterFunciton(arr , target , start , end));
    }

    static char smallestLetterFunciton(char[] arr , char target , int start , int end){

        while(start < end){
            int mid = ( start + end) / 2;
            if(arr[mid] < target ){
                mid = end -1 ;
            }
            else{
                mid = start = 1;
            }
        }
        System.out.println(start % arr.length);
        return arr[ (start % arr.length )];
    }
}

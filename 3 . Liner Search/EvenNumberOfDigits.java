public class EvenNumberOfDigits {
    public static void main(String[] args) {
        
        int[] nums = { 12 , 345  , 6, 7689 , -1234};
        int count , temp ;

        for(int a : nums){
            temp = a;
            count = 0 ;
            while(a > 0){
                count++;
                a = a/10;
            }
            if(count%2==0){
                System.out.print(temp + " ");
            }
        }
    }
}

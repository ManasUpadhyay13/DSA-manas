public class FindTheFirstLastIndex{
    public static void main(String[] args){

        int[] nums = { 1 , 2 , 4 , 4 , 4 , 4 , 6 , 7 , 8};
        int target = 4;

        System.out.println(findthefirstandlastindex(nums , target));
    }

    static int[] findthefirstandlastindex(int[] nums , int target ){
         int[] ans = { -1 , -1};


         int start = findindex(nums , target , true);
         int end = findindex( nums , target , false );

         ans[0] = start ;
         ans[1] = end;
         System.out.println(start);
         System.out.println(end);
         return ans;
    }

    static int findindex(int[] nums , int target , boolean findfirstindex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1 ;

        while( start < end ){
            int mid = ( start + end ) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if( target > nums[mid]){
                start = mid + 1;
            }
            else{
                // this may be our ans but still we don't know there must be another answer as well

                ans = mid;
                if(findfirstindex){
                    end = mid -1;
                }
                else{
                    start = mid + 1; 
                }
            }
        }

        return ans;
    }
}
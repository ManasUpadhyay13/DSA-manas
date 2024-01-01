class Revision{
    public static void main(String[] args){
        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 7, 8 , 9};
        int search = 6;
        int start = arr[0] , end = arr[arr.length - 1] , mid = arr.length/2 ;
        while(start < end){
            if(arr[mid]==search){
                System.out.println(arr[mid]);
            }
            else if(arr[mid] > search){
                end = mid -1;
            }
            else{
                start =  mid + 1;
            }
        }
        System.out.println("Exit");
    }
}
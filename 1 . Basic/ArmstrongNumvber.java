public class ArmstrongNumvber {
    public static void main(String[] args) {
        int sum;
        System.out.println("All the armstrong numbers between 100 and 999 are : ");
        for(int i =100 ; i<=999 ; i++){
            sum = 0;
            armstrong(i, sum);
        }
    }

    static void armstrong(int i , int sum){
        int temp , d;
        d=i;
        while(i>0){
            temp = i%10;
            sum = sum + (temp * temp * temp);
            i = i/10;
        }
        if(sum == d){
            System.out.println(d);
        }
    }
}

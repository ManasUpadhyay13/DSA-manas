public class MaximumWealth {
    public static void main(String[] args) {
        
        int[][] wealth = {
            {1 , 5},
            {7 , 3},
            {3 , 15}
        };

        int maxSal = 0 ;
        int sal ;

        for(int[] row : wealth){
            sal = 0;
            for(int col : row){
                sal = col + sal;
            }
            if(sal > maxSal){
                maxSal = sal;
            }
        }

        System.out.println(maxSal);
    }
}

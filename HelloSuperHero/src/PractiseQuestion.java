import java.util.Scanner;
public class PractiseQuestion {
    public static int kadanemin (int arr[]) {
        int sum = 0 ;
        int max = 0 ;
        for ( int i  = 0 ; i< arr.length ; i++) {   
            sum+=arr[i];
            if ( sum > 0 ) {
                sum = 0 ;

            }
            max = Math.min(sum , max);
        }
        return max;
    }


    
    public static void main ( String [] args) {
        Scanner PQ = new Scanner(System.in);
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(kadanemin(arr));
   



      
    


        PQ.close();

    }

}

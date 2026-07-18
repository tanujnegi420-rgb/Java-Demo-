public class PracticeArray {
    public static void pairinarray ( int arr[] ) {
        int tp = 0 ;
        for ( int i = 0 ; i < arr.length ; i++) {
            for ( int j = i+1  ; j< arr.length ; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                tp++;

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("No of Pair : " + tp);

    }
    public static int BinarySearch ( int arr[] , int key ) {
        int start = 0 ; 
        int end = arr.length-1;
        while ( start <= end) {
            int mid = start + ( end - start ) / 2;
            if ( arr[mid] == key ) {
                return mid ;
            }
            if ( arr[mid] > key ) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void subarray ( int arr[]) {
        int tp = 0;
        int sum =0 ;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for ( int i = 0 ; i < arr.length ; i++) {
            for (int j = i; j < arr.length ; j++) {
                for ( int k = i ; k <= j ; k++) {
                    System.out.print(arr[k] + " "); /// print 
                    sum+=arr[k];//Sum ;

                }
                if ( sum > max) {
                    max = sum ;
                }
                if ( sum < min) {
                    min = sum;
                }
                sum = 0 ;
                tp++; // yha update ho rha ha 
                System.out.println();// next line 

            }
            System.out.println();// next line 
        }
      
        System.out.println("Total no of subarray : " +tp);
        System.out.println("max is : " + max);
        System.out.println( "min is : " + min);
        System.out.println();
        
    }
    public static void main (String [] args) {
        int arr[] = { 4, 6 , 7 ,12 , 13 , 15 };
        subarray(arr);
       
      

    }

}

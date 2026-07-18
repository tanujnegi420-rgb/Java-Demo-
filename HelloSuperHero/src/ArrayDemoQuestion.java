import java.util.*;

public class ArrayDemoQuestion {
    //Fucntion for to CAlculate findmax in array 
    public static int FindMax ( int [] arr) {
        if ( arr.length == 0 || arr == null) {
            return -1;
        }
        int max = arr[0];
        
        
        for ( int i = 1 ; i < arr.length ; i++) {
            if (arr[i] > max ) {
                max = arr[i];
            }
        }
        return max ;
    }
    //Fucntion to calculate reversearray 
    public static int[] reversearray ( int [] arr) {
        int [] reverse = new int [arr.length];
        for ( int i = 0 ; i < arr.length ; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }
        return reverse ;
    }
    //Function to calculate counteven 

    public static int countEven ( int [] arr) {
        int countEven = 0;
        for ( int i = 0 ; i < arr.length ; i++) {
            if (arr[i] % 2 == 0 ) {
                countEven++;

            }
        }
        return countEven;
    }
    //Fucntion to calculate sumofarray 
    public static int sumofArray ( int [] arr) {
        int sum =0;
        for ( int i = 0 ; i < arr.length ; i++) {
            sum+=arr[i];

        }
        return sum;
    }
    //Function to calculate ispalindromeArray 
    public static boolean isPalindromeArray ( int [] arr) {
        for ( int i = 0 ;i<arr.length ; i++) {
        if ( arr[i] != arr[arr.length -1-i]){
            
            return false ;
           
            

        }
        }
        return true;
    }
    public static void maxsubarray ( int arr []) {
        if (arr == null || arr.length == 0) {
            System.out.println("Max is : -1");
            return;
        }

        int currentSum = arr[0];
        int maxSum = arr[0];
        boolean hasPositive = arr[0] >= 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= 0) {
                hasPositive = true;
            }
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        if (!hasPositive) {
            System.out.println("Max is : -1");
            return;
        }

        System.out.println("Max is : " + maxSum);
    }
public static void TrappedWater ( int height[]) {
   int  n = height.length;
   int leftmax[] = new int[n];
   leftmax[0]= height[0];
   for ( int i = 1 ;i < n ; i++) {
    leftmax[i] = Math.max(leftmax[i-1] , height[i]);

   }
   int Rightmax[] = new int[n];
   Rightmax[n-1] = height[n-1];
   for ( int i = n-2 ; i >= 0; i--) {
    Rightmax[i] = Math.max(Rightmax[i+1] , height[i]);
   }

   int TrappedWater = 0 ;
   for ( int i = 0 ; i < n ; i++) {
    int waterlevel = Math.min(leftmax[i] , Rightmax[i]);
    TrappedWater+=waterlevel - height[i];
   }
   System.out.println("Total Trapped Water is : " + TrappedWater);


} 
public static void  Triplets ( int arr[]) {
    if ( arr == null || arr.length-1<3) {
        System.out.println("No triples : [] ");
        return;
    }
for ( int i = 0 ; i < arr.length-2 ; i++) {
    for ( int j = i+1 ; j < arr.length-1 ; j++ ){
        for ( int k = j+1 ; k < arr.length ; k++) {
            if ( ((arr[i]!=arr[j] && arr[j]!=arr[k]) && arr[i]!= arr[k]) && arr[i] + arr[j]+ arr[k] == 0 ) { 
                System.out.println("["+arr[i]+ "," + arr[j] +"," + arr[k] + "]");

            }
            

        }
    }
}
System.out.println();
}
        public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {};
        // TrappedWater(height);
        Triplets(arr);


        // maxsubarray(arr);
       
        sc.close();
       

}
}

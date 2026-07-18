import java.util.*;
public class ArrayDemo {
    //Function to check array is call by refrencs and int is call by value 
    public static void update ( int marks[] , int nonchangeble ) {
        nonchangeble = 10;
        for ( int i = 0 ; i < marks.length ; i++) {
            marks[i] = marks[i]+1 ;

        }

    }
    //Function to linear Seach 
    public static int LinearSearch ( int arr[] , int key ) {
        for ( int i = 0 ; i< arr.length ; i++) {
            if( arr[i] == key ) {
                return i;
            }
        }
        return -1;
        

    }
    //Function for linear Search in String
    public static int LinearSearch ( String Fav[] , String key ) {
        for ( int i = 0; i < Fav.length ; i++) {
            if ( Fav[i].equalsIgnoreCase(key)) {
                return  i;
            }
        }
        return -1; 
    }
    public static int Largest( int arr[] , int max) {
        
        for ( int i = 0 ; i< arr.length ; i++) {
            if(arr[i] > max ) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int Smallest ( int arr[] , int min ) {
        for ( int i = 1 ; i < arr.length ; i++ ) {
            if( arr[i] < min ) {
                min = arr[i];

            }
        }
        return min;
    }
    ///Binary Search Array must be sorted if not it will not work 
    public static int BinarySearch ( int arr[] , int key ) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end ) {
            int mid = start + (end-start ) / 2;
            
                if ( arr[mid] == key ) {
                    return mid ;
                 }
                  if ( arr[mid] < key ) {
                    start = mid +1 ;
                }else {
                    end = mid -1 ;
                }
                }
        
        return -1 ; 

    }
    //Reverse Array but sc(n) and tc(n);
    public static int[] reversearray( int arr[]) {
        int reverse[] = new int[arr.length];

        for ( int i = 0 ; i < arr.length ; i++) {
            reverse[i] = arr[arr.length-i-1];

        }
        return reverse;
    }
    ///Fucntion of reverseArray but sc (1) and tc (n/2) 
    public static void reverseArray ( int arr[]) {
        int first = 0 ;
        int last = arr.length -1;
        while (first < last   ) {
            //swap--
            
            int temp = arr[first];
            arr[first] =  arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
    public static void Arrayinpair ( int arr[] ) {
        int tp = 0;
        for ( int i = 0; i< arr.length-1 ; i++) {
            System.out.println();
            for ( int j = i+1 ; j < arr.length ; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") "  );
                tp++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("no of pair : " + tp);
        
    }
    public static void subarray ( int arr[]) {
        int ts = 0;
        for ( int i = 0; i < arr.length; i++) {
           
            for ( int j= i ; j< arr.length ; j++)  {
               
                for ( int k = i; k <=j ; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
                             
            } 

            System.out.println();
            

           }


        System.out.println("Total subarray : " + ts );
        
    }
    //this max subarray with tc(n2) and sc(n);
    public static void maxinsubarray ( int arr[]) {
        int currsum= 0 ;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for  ( int i = 1; i<arr.length ; i++) {
            prefix[i] = prefix[i-1] + arr[i];

        }
        for ( int i = 0 ; i < arr.length; i++) {
            currsum= 0 ;
            for ( int j = i ; j< arr.length;j++) {
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

 if ( currsum > max ) {
                max = currsum ;
            }
            }
           
            
        }
        System.out.println("max is : " + max);
    }
    // This is called Kadane Method to find max in subarray and the time complexity will be tc(n) and space sc(1);
    public static void kanademethod ( int arr[]) {
        int currsum = 0 ; 
        int maxsum = Integer.MIN_VALUE;
        for ( int i = 0 ; i < arr.length ; i++) {
            currsum+=arr[i];
            if( currsum < 0 ) {
                currsum = 0;
                
            }
            maxsum = Math.max(currsum, maxsum );
        }
        System.out.println("max is : " + maxsum);
    }

    //This Function is to find trapped water ;
public static void TrappedWater ( int height[]) {
    int TrappedWater = 0 ;
    
    /// Leftmax - boundary;;
    int leftmax[] = new int[height.length];
     leftmax[0] = height[0];//Leftmax[0]  set 
    for ( int i = 1 ; i < height.length ; i++) { // loop for rest value
        leftmax[i] = Math.max(leftmax[i-1] , height[i]);
    }
    int Rightmax[] = new int[height.length]; //Right max boundary ; we also call them auxillary array 
    Rightmax[height.length-1] = height[height.length-1]; // set last value as max right
    for ( int i = height.length-2 ; i>= 0 ; i--) { // loop for rest value 
        Rightmax[i] = Math.max(Rightmax[i+1] , height[i]); // i+1 because loop is reverse last value lets say 6 then i+1 to 5 okk 


    }// loop for waterlevel 
    for (int i = 0 ; i < height.length ; i++) {
         int waterlevel= Math.min(leftmax[i] , Rightmax[i]); //Water level will be min of left and right
        TrappedWater += waterlevel -height[i]; // Trapped Water ;
      
    }
    System.out.println("Total Trapped Water will be : " + TrappedWater);// Print Trapped Water 
    
}
public static void BuyStock ( int prices[] ) {
    int profit = 0 ;
    int maxprofit = 0 ;
    int Buystock = prices[0];
    for ( int i = 1 ; i < prices.length; i ++) {
        if ( Buystock < prices[i]) {
            profit = prices[i] - Buystock ;
            maxprofit = Math.max(profit , maxprofit);
        }else {
            Buystock = prices[i];
        }
    }
    System.out.println("Max profit is : "  + maxprofit );
}

public static boolean isrepeat ( int arr[]) {
    if (arr == null || arr.length == 0 ) {  
        return false ;
    }
    for ( int i = 0 ; i < arr.length-1; i++) {
        for ( int j = i+1 ; j < arr.length ; j++) {
            if ( arr[i] == arr[j] ){
                return true;
            }
        }
    }
    return false;
}
    public static void main ( String args[]) {
        Scanner sc = new Scanner(System.in );
       int arr[] = {4 , 6, 3, 2 , 5};
//  Arrayinpair(arr);
// subarray(arr);
// maxinsubarray(arr);
// kanademethod(arr);
// TrappedWater(height);
// BuyStock(prices);
System.out.println(isrepeat(arr));
        sc.close();
        

    }
}
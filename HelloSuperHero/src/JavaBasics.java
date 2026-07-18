import java.util.*;
public class JavaBasics {
    public static void printhelloworld() { // This is function have void type (varialbe type ) and name of box is ( printhelloworld) nothing return okk
        System.out.println("Hello World"); 
          System.out.println("Hello World");
            System.out.println("Hello World");
              System.out.println("Hello World");
                System.out.println("Hello World");
                  System.out.println("Hello World");
                    System.out.println("Hello World");
    }


public static int CalculateSub (int a , int b ) {
   
    return a-b;
}
public static int CalculateSum ( int a , int b ) {
  
    return a+b;
}
public static int CalculateMul(int a, int b ) 
{
    
    return a*b;
}

public static void swap (int a , int b ) {
       
     //swap exchange 
     int temp = a ;
     a = b;
     b = temp;
     System.out.println("a = " + a);
     System.out.println("b = " +  b);


}
public static void Changea(int a ) { // calll by refernce ha mtlb esme formal parameter me copy value ha na ki reall
 a= 10;
}
// Func to calculate Mulitply 
public static int Multiply ( int a , int b ) {
    int product = a*b;
    return product;

}
// func to calculate Factorial ;
public static int Factorial ( int a ) {
    int f = 1;
    if ( a == 0 || a == 1 ) {
        return 1 ;
    }
    for ( int i = 1 ; i <= a ; i++) {
        f*=i;
    }
    return f;
}
// func to calculate Binomial cofficenit 
public static float BinomialCofficient ( int a , int r ) {
    float binomial =  (float) Factorial(a) /  (Factorial (a-r) * Factorial(r));
    return binomial ;
}
// func to calculate int sum of a , b ,c 
public static int CalculatorSum ( int a , int b , int c  ) {
    return a+b+c;

}
//func to calculate float sum of a, b ,c 
public static float CalculatorSum ( float a , float b  , float c) {
    return a+b+c;
}
// Check no is prime or not ;
public static boolean isprime ( int n ) {
    boolean isprime = true;
     if ( n == 2   ) {
           return true ;
        }
        if ( n == 1 ) {
            return false;
        }
    for ( int i = 2 ; i< n  ; i++) {
       


        if ( n % i == 0 ) {
            isprime = false;
            break;
        }
        
    }
    return isprime ;

}
/// optimised way for is prime function 
public static boolean Opisprime ( int n ) {
    if( n == 1 ) {
        return false;
    }
    if ( n == 2 ) {
        return true;

    }
    for ( int i = 2 ; i <= Math.sqrt(n) ; i++) {
        if ( n  % i == 0) {
            return false;
        }
    }
    return true ;
}
// Func for Calculate Prime in Range ;
public static void PrimeinRange( int n ) {
    for ( int i = 1 ; i <= n ; i++) {
 if ( isprime(i)) {
        System.out.println(i);
    }
} 
    }
   
// Function for Calculate Binary to Decimal ;
    public static int BintoDecimal (int n ) {
        int lastdigit = 0 ;
        int decimal =0 ;
        int power = 0;
         while ( n > 0 ) {
            lastdigit = n % 10 ;
            decimal = decimal + lastdigit * (int) Math.pow(2 , power);
            power++;
            n/=10;

         }
         return decimal;

    }
    //Function to Calculate Decimal to Binary ; 
    public static int DectoBinary ( int n ) {
        int rem = 0 ; 
        int power = 0 ; 
        int Bin = 0;
        while ( n > 0 ) {

            rem = n % 2 ;
            Bin = Bin + rem*(int) Math.pow(10 , power);
            power++;
            n/=2;


        }
        return Bin;

    }
    //Function to Calculate Average of 3;
    public static Double Averageof3 (double a  , double b , double c ) {
        return (a+b+c)/3 ;

    }
    //Fucntion to Calculate isEven or not 
    public static boolean isEven ( int a ) {
        if ( a % 2 == 0 ) {
            return true;
        }else {
            return false;
        }

    }
    //Fucntion to Calculate no is palindrome or not 
    public static void isPalindrome ( int a ){
        int original =a ;
        int reverse = 0 ; 
        int lastdigit = 0 ;
        while ( a > 0 ) {
            lastdigit = a % 10 ;
            reverse = reverse *10 + lastdigit ;
            a/=10;

        }
        if ( original == reverse ) {
            System.out.println(  original + " is a palindrome ");

        }else {
            System.out.println( original + " is not a palindrome ");
        }

    }
    public static int fibonic ( int n ) {
        // int f = 0 ;
         if ( n == 0 ) {
            return 0;
         }
         if( n == 1 ) {
            return 1;

         }
         int prev = 0;
         int curr = 1 ;

         for ( int i = 2 ; i <= n ; i++) {
              int next = prev + curr;
              prev = curr;
              curr = next;


         }
         return curr;
    }
    //fucntion to Calculate to Sum of digit 
    public static int Sumofdigit ( int a ) {
        int lastdigit = 0 ; 
        int sum = 0 ;
        while ( a > 0 ) {
            lastdigit = a % 10 ;
            sum+=lastdigit;
            a/=10;
        }
        return sum;
    }
public static int rotatesortedArray ( int arr[] , int target) {
    int s = 0 ; 
    int e = arr.length-1;
    while (  s<=e ) {
        int mid = s + ( e-s )/2;
        if (arr[mid] == target ) {
            return mid ;

        }
        if ( arr[s] <= arr[mid]) {
            if ( arr[s] <= target && target <arr[mid]) {
                e =  mid-1;

            }else {
                s = mid+1;
            }
        }else {
            if ( target > arr[mid] && target < arr[e]) {
                s = mid+1;

            }else {
                e = mid-1;

        }
        }
    }
    return -1;
}
public static int countlowercase( String str) {
    int count = 0 ;
    for ( int i = 0 ; i < str.length() ; i++) {
        char ch = str.charAt(i);
        if ( ( ch == 'a' || ch == 'e' ||  ch =='i' ||ch== 'o' || ch  == 'u')  ) 
            count++;
        
    }
    return count; 


}
    
public static void main ( String [] args) {
    Scanner sc = new Scanner(System.in);
//   int matrix[][] = { { 4 , 7 , 8 } ,
//                         {8 , 8, 7}};
                        // System.out.println(repeat7s(matrix, 7));

                        String str = "I am Tanuj Negi ji";
                        System.out.println(countlowercase(str));
    sc.close();


    

   
 
    
}
}   
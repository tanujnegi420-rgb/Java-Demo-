import java.util.*;

public class PatternDemo {
    //Function to print hollow rectangle pattern 
    public static void hollowPattern ( int totRow , int totCol ) {
        for ( int i = 1 ; i <= totRow ; i++) {
            for ( int j = 1 ; j <= totCol ; j++) {
                if ( i ==1 || i == totRow || j == 1 || j == totCol ) {
                    System.out.print("*"   );

                }else {
                    System.out.print(" ");
                }
                
            }

            System.out.println();
            
        }

    }
    // Function to print inverted half rotated pattern 
    public static void invertedhalfRotated ( int  n ,int  m ) {
        for ( int i = 1 ; i <= n ; i++) {
            for ( int j = 1 ; j<=n-i ; j++) {
                System.out.print(" " + " ");
            }
            for ( int j = 1 ; j <= i ; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();
        }

    }
    //Function to print inverted half pyramid pattern 
    public static void invertedhalfPyramid ( int n ) {
        for ( int i = n ; i >= 1 ; i--) {
            for ( int j = 1 ; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    //Funtion to print inverted half pyramid pattern 2nd method 
    public static void invertedhalfPyramid2 ( int n ) {
        for ( int i = 1 ; i <= n; i++) {
            for ( int j = 1 ; j<=n-i+1 ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // Function to print flyod triangle pattern 
    public static void flyodTriangle ( int n ) {
        int count = 1 ;
         for ( int i = 1 ; i <= n ; i++){
            for ( int j = 1; j <=i ; j++) {
                System.out.print(count + " " );
                count++;
            }
            System.out.println();
         }
    }
    // Function to print 0-1 triangle pattern 
    public static void zerooneTriangle ( int n  ) {
        for ( int i = 1  ; i <= n ; i++) {
            for ( int j = 1 ; j <= i; j++) {
                if ( (i+j ) % 2 == 0 ) {
                    System.out.print(1 + " ");
                }else {
                    System.out.print(0 + " ");
                }
                
                
            }
            System.out.println();
        }
    }
    //Function to print butterfly pattern 
    public static void Butterfly ( int n ) {
    for ( int i= 1; i <= n ; i++) {
        for ( int j = 1 ; j<= i ; j++) {
            System.out.print("*");
        }
        for ( int j = 1 ; j<= 2* (n-i); j++ ) {
            System.out.print(" ");
        }
        for ( int j = 1; j<= i ; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = n ; i >= 1 ; i--) {
        for ( int j = 1 ; j<= i ; j++) {
            System.out.print("*");
        }
        for ( int j = 1 ; j<= 2* (n-i); j++ ) {
            System.out.print(" ");
        }
        for ( int j = 1; j<= i ; j++) {
            System.out.print("*");
        }
        System.out.println();

    }
    }
    //Function to print solid rhombus pattern 
    public static void SolidRhombus ( int n ) {
        for ( int i = 1 ; i <= n ; i++) {
            for ( int j = 1; j <= n-i ;j++) {
                System.out.print(" " + " ");

            }
            for ( int j = 1 ; j<= n ; j++ ) {
                System.out.print("*" +  " ");
        
            }
            System.out.println();
        }
        
    }
    //Function to print diamond pattern 
    public static void DiamondPattern ( int n ) {
       for ( int i =1 ; i<= n ; i++) {
        for ( int j=1 ; j <= n-i ; j++ ) {
            System.out.print(" ");
        }
        for (int j = 1 ; j<=(2*i-1);j++) {
            System.out.print("*");
        }
        System.out.println();
       }
       for ( int i = n; i >= 1; i--) {
         for ( int j=1 ; j <= n-i ; j++ ) {
            System.out.print(" ");
        }
        for (int j = 1 ; j<=(2*i-1);j++) {
            System.out.print("*");
        }
        System.out.println();
       }
       System.out.println();

    }
    
    //Function to print number pyramid pattern
    public static void numberpyramid ( int n ) {
        for ( int i = 1 ; i <= n ; i++) {
            for ( int j = 1; j<= n-i ; j++) {
                System.out.print(" ");
            }
            for ( int j = 1 ; j <= i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    //Fucntion to print PalindromePattern; 
    public static void palindromePattern  ( int n ) {
        for ( int i = 1 ; i<= n; i++) {
            for ( int j= 1 ; j<= n-i ; j++) {
                System.out.print(" " + " ");
            }
            for ( int j = i ; j>= 1 ; j--) {
                System.out.print(j + " ");
            }
            for ( int j =  2 ; j<= i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }

        System.out.println();

            
            
        }
        //Function to print Hollow Rhombus 
        public static void hollowRhombus ( int n ) {
            for ( int i = 1 ; i <= n ; i++) {
                for ( int j = 1 ; j <= n-i ; j++) {
                    System.out.print(" ");
                }
                for ( int j = 1 ; j <= n ; j++) {
                    if ( i == 1 || i == n || j == 1 || j == n) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                 }
                 System.out.println();
            }
            System.out.println();
        }
        
    
    public static void main ( String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter n : ");
    // int n = sc.nextInt();
    // System.out.print("Enter m : ");
    // int m = sc.nextInt();
    // hollowPattern(n,m);
    // invertedhalfRotated(n,m);
    // invertedhalfPyramid(n);
    // invertedhalfPyramid2(n);
    // flyodTriangle(n);
    // zerooneTriangle(n);
    // Butterfly(n);
    // SolidRhombus(n);
    // DiamondPattern(n);
    // numberpyramid(n);
    // palindromePattern(n);
    // hollowRhombus(n);

    
      sc.close();

}
}

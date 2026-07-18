public class RecurssionDemo {
    public static int decresingorder ( int n ) {

        if ( n == 1) return 1 ;
        System.out.println(n);
        return decresingorder(n-1);
    }
    public static void increasingorder ( int n ) {
       if ( n ==  1 ) {
        System.out.println(1);
        return;
       }
    increasingorder(n-1); // Phle call karna fir print 
    System.out.println(n);
  
    }

    public static int factorial ( int n ) {

        //Using iteration --
        // int fac =  1;
        // if ( n == 0 || n == 1) return 1 ;
        // for ( int i = 2 ; i<=n ; i++) {
        //     fac*=i;
        // }
        // return fac;


        //Using recursion tc of big of n and sc big of n
     
        if ( n == 0 || n == 1 )return 1;
      
        return n*factorial(n-1);
    }
    public static int sumofn ( int n ) {

        //Simple way to do --
        // int sum = 0;
        // for ( int i = 1 ; i<=n ; i++) {
        //     sum+=i;

        // }
        // return sum ;

    // Using recurssion 

    //Base class 
    if ( n == 0 ) return 0;
    if ( n == 1 )  return 1 ;

    return n+sumofn(n-1);
    
    }
    public static int fibonacci ( int n ) {
        //simple way to do 
        
    //     if ( n == 0) return 0;
    //     if (n == 1 ) return 1;
    //     int curr = 1;
    //     int prev = 0;
    // for ( int i = 2 ; i <=n ; i++) {
    //     int next = curr + prev;
    //     prev = curr;
    //     curr = next;

    // }
    // return curr;


    //Recurssion way to do

    // Base class
if ( n== 0 )return 0;
if ( n == 1 ) return 1;

return fibonacci(n-1)+fibonacci(n-2);

    }
    public static boolean isSorted ( int nums[] , int i ) {
        //simple way to do ;

        // if ( nums == null) return true;
        // if( nums.length == 0) return true;
        // for ( int i =  0 ; i < nums.length-1; i++) {
        //     if ( nums[i] > nums[i+1]) {
        //         return false;
             

        //     }
        // }
        // return true;

        //Recurssion way 

        //Base class 
        
        if ( nums.length == 0) return true;
        if ( i == nums.length-1) return true;
         if (nums[i] > nums[i+1]) return false;
        return  isSorted(nums , i+1);

    }
    public static int firstOcc(int nums[], int key, int i) {
        if (i == nums.length) return -1;
        if (nums[i] == key) return i;
        return firstOcc(nums, key, i+1);
    }
    public static int LastOcc( int nums[] , int key , int i) {
        if( i < 0 ) return -1 ;
        if ( nums[i] == key ) return i;
        return LastOcc(nums, key, i-1);
    }
    public static int xpowern(int x , int n ) {

        //Simple way to do 
        //tc 0(n) and sc(n);
        // if ( n == 0  ) return 1;
        
        // return  x * xpowern(x, n-1);
        

        // Optimiised Way 
        if ( n == 0 ) return 1 ;
        // int power = xpowern(x, n/2)*xpowern(x, n/2); //tc (n) ;
        int power= xpowern(x, n/2); // Ab tc big 0(logn ) ;;; Dyan rkhnaa esko ye important 

        int twopower  = power *power;
        if ( n % 2 != 0 ) return twopower *x;
        return twopower;
    }
    public static int tiling( int n )  { //2 *n 
        if ( n == 0 || n == 1 ) return 1;

        int totalways = tiling(n-1) + tiling(n-2) ; // vetical and horizantal waysss
return totalways;

    } 

    public static void PrintBinString ( int n  , int lastplace , String str) {
        //Base class --
        if ( n == 0 ) {
        System.out.println(str);
        return;
        }
        PrintBinString(n-1, 0, str+"0");
        if(lastplace == 0) {
            PrintBinString(n-1, 1, str+"1");
        }


    }
    public static void printOcc( int nums[] , int key , int i ) {
        // Base case
        if ( i == nums.length) {
            return ;

        }
        if (nums[i] == key ) {
            System.out.print(i + " ");
            
            
        }
       printOcc(nums, key, i+1);
       
    }
    public static int  lengthofstring ( String str , int i) {
      
        if ( i == str.length() ) return 0;
        return 1+lengthofstring(str, i+1);    

    }

    public static String inttoEnglish ( int n , int i , StringBuilder newstr) {
       
        String str = String.valueOf(n);
          //Base case
        if( i == str.length()) {
            return newstr.toString().trim();
        }
        char digit = str.charAt(i);

       
        
        // Kamm Kya ho rha ha 

        switch(digit) {
            case '0' : newstr.append("zero ");break;
            case '1' : newstr.append("one ") ; break;
            case '2' : newstr.append("two ") ; break;
            case '3' : newstr.append("three "); break;
            case '4' : newstr.append("four "); break;
            case '5' : newstr.append("five "); break;
            case '6' : newstr.append("six ") ;break;
            case '7' : newstr.append("seven "); break;
            case '8' : newstr.append("eight "); break;
            case '9' : newstr.append("nine "); break;
        }
    return inttoEnglish(n, i+1, newstr);
    }
    public static int countSubstringdouble( String s ) {
        //Recursioon bahut muskill kuch kamm nhi ayeega 

        int freq[] = new int[26]; //fixed ha sc big (1) rhegi 
        for ( int  i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch -'a']++;

        }
         int totalways = 0 ;
        for ( int i = 0 ;i < 26 ; i++) {
            int k = freq[i]; // konsa number kitni barr haaa
            if ( k > 0 ) {
                totalways += k*(k+1)/2; // Or u can write this k *(k-1)/2 + k in this k - left wala kitne letter ha 

            }
        }
        return totalways;

    }
    public static void towerofhanoi ( int n , String s , String h, String d ) {
        // n - no of disk
        // s - source rod 1  ( kha se uthna ha )
        // h - helper rod 2  ( helper )
        // d - destitation rod3 ( uta ke kha rkhna ha )

        //Agar sirf  ek disk toh sidhe destination par dall do 
        if ( n == 1 ) {
         System.out.println( "Step " +n + " from "   + s  + " to " + d);
         return;
        } 

      
      
  //Step 1 -      //upar ki (n-1 ) disk ha src se utha kar helper par rkh do 
        // esme dyan se dekho helper -destination ban gya n-1 ke liye 
        towerofhanoi(n-1, s, d, h); 


  //Step -2   // Ab jo nth disk ha use destination par bhj do source se uta kar       
        System.out.println("Step " + n + " from " + s + " to " + d);

  //Step -3 //Ab jo helper par tha use n-1 disk use destination par bhjni ha toh
   // jo disk helper par ha use source par bhjo 
  towerofhanoi(n-1, h, s, d );  

    }
    public static void main (String args[]) {
        // System.out.println(decresingorder(6));
    //    increasingorder(6);
        // System.out.println(factorial(10));
        // System.out.println(sumofn(21));
        // System.out.println(fibonacci(28));
        // int nums[] = {8, 3, 6, 9, 5, 10 , 2, 5, 3};
        // System.out.println(isSorted(nums , 0));
        // System.out.println(firstOcc(nums, 5, 0)); // i = 4 
        // System.out.println(LastOcc(nums, 5, nums.length-1)); // i = 7
        // System.out.println(xpowern(2, 9));
        // System.out.println(tiling(3 ));
        // PrintBinString(3, 0, "");
//         int nums[] = { 3 , 2 ,4 , 5,6 ,2 ,7, 2 ,2 };
//   countOcc(nums, 2, 0);
// String str = "da idv ";
// System.out.println(str.length());
// System.out.println(lengthofstring(str, 0));

// System.out.println(inttoEnglish(4250432, 0, new StringBuilder("")));

// String s= "abvcdfasddgdf";
// System.out.println(countSubstringdouble(s));
  int totalDisk = 4;
towerofhanoi(totalDisk, "A", "B", "C");

    }
} 



public class BitDemo {
    public static int DectoBin ( int n ) 
    {
        int power =0 ;
        int Bin = 0 ;
         while ( n > 0 ) {
        Bin = Bin + n%2 * (int)Math.pow(10 , power);
        power++;
        n/=2;
         }
         return Bin;
    }
    public static int BintoDec ( int n ) {
        int power =0;
        int Dec = 0;
        while ( n >0) {
            Dec = Dec + n%10 *(int) Math.pow(2,power);
            power++;
            n/=10;
        }
        return Dec;
    }
    public static void EvenOdd ( int n ) {
        if ( (n & 1) == 0) // 1 can be called bitmask; 
            System.out.println(n + " is even ");//even 
        else{
            System.out.println(n + " is odd" );//odd
        }
    }
    public static int getithBit ( int n , int i){
       int Bitmask = 1<<i;
       if ( (n & Bitmask) == 0 )
        return 0;
    else
    return 1;

    }
    public static int setithBit ( int n , int i ){
        int Bitmask = 1<<i;
     return n|Bitmask;
    }
    public static int clearithBit( int n , int i ) {
        int Bitmask = ~(1<<i);
        return n & Bitmask;
    }
    public static int updateithbit( int n , int i , int newBit) {
        // if ( newBit == 0 ) {
        //     return clearithBit(n, i);
        // }else{
        //     return setithBit(n, i);
        // } 
 
        n = clearithBit(n, i); // ith value ko zero kar dega fir 
        int Bitmask = newBit<<i; //agar newbit zero hua toh zero hi rhega or 1 hua toh 1 ho jayega
        return n  | Bitmask ;
    }
    public static int ClearlastithBite ( int n , int i ) {
        int Bitmask = (~0)<<i; // or write can like (-1)>>i
        return n & Bitmask;

    }
    public static int ClearRangeitsBit( int n ,int i , int j ) {
        int a = (~0)<<j+1;
        int b = (1<<i) -1;
        int bitmask = a|b;
        return n & bitmask;
    }
    public static void powerof2 ( int n ) {
        if ( (n& (n-1)) == 0 )
           System.out.println(n + " is a power of 2");
        else {
            System.out.println(n + " is not a power of 2");
        }

    }
    public static int CountsetBit( int n ) {
        int count = 0 ;
        while ( n > 0 ) {
            if (( n& 1) != 0 )
                count++;
            n = n>>1;
            
        }
        return count;
    }
    public static boolean issquareroot( int n ) {
        long lp = 0;
        long rp = (int)Math.sqrt(n);
        while(lp <= rp) {
        long pr = lp*lp + rp*rp;
        if ( pr == n) {
            return true;

        }else if (pr > n) {
            rp--;
        }else{
            lp++;
        }
        }
        return false;
    }
    public static int Fastexpo ( int  a , int n ) {
        int ans = 1 ; 
        while ( n > 0 ) {
            if ( (n & 1) != 0) { //check lsb
                ans = ans*a;
            }
            a = a*a;
          n=  n>>1;

        }
        return ans;
    }
    public static int Addone ( int n ) {
        return -(~n);
    }
    public static void uppertolower ( String n ) {
        for ( char ch = 'A' ; ch<='Z' ; ch++) {
               System.out.println("Lower Case : " + (char)( ch | ' ')  );
        
        }
    }
    public static void main ( String args[]) {
        
        // System.out.println(DectoBin(11));
        // System.out.println(BintoDec(1000));
        // System.out.println(5&10); /// 0 //and Condition &
        // System.out.println(5|10); //15 // or Codition |
        // System.out.println(5^5); // 0 // XOR Condtion ^
        // System.out.println(~10); // -11 
        // System.out.println(~0);// -1;
        // System.out.println(~1); // -2
        // System.out.println(5<<2); // a<<b = a * 2^b //20
        // System.out.println(6<<2); //24
        // System.out.println(6>>2);//1 // a>>b = a/2^b;
        // System.out.println(1>>1);
        // System.out.println(8>>3);//1
        // EvenOdd(908 );
        // EvenOdd(67);
        // EvenOdd(45);

      
// System.out.println(getithBit(6, 3)); //0

// System.out.println(setithBit(5, 2));//5

// System.out.println(clearithBit(5, 2)) ; //1
// System.out.println(clearithBit(10, 3)); //2


// //Update ith 
// System.out.println(updateithbit(6, 0, 1));//7

// //Clear last ith 
// System.out.println(ClearlastithBite(7 ,1)); //4

// //Clear bits in Range 
// System.out.println(ClearRangeitsBit(10, 2, 4)); ///2



// System.out.println(CountsetBit(18));
// System.out.println(issquareroot(10));S
// System.out.println(Fastexpo(2, 10));
// System.out.println(Addone(6));
uppertolower("");


    }
}
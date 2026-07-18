public class BreakContinueDemo {
    public static void main (String[] args) {
        
// // Break Loop 
//        for( int i = 1 ; i<=100 ; i+=2  ) {
//         if ( i == 23) {
//             break;
//         }
//         System.out.println(i);
//        }

//Continue Loop 
for ( int i = 1 ; i<=100 ; i++) {
    if ( i% 2 != 0) {
        continue;

    }
    System.out.println("Even : " + i);
}
    }

}

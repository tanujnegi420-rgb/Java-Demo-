// public class JavaDemoQuestion {
//     public static void main(String[] args) {
//         int [ ]  arr = { 10 , 5 , 8 , 12 , 7 };
//         int max = arr[0];
//         int secondmax = Integer.MIN_VALUE;
//         if ( arr.length < 2 ) {
//             System.out.println(-1);
//             return;

//         }

//         for ( int i= 0 ; i < arr.length ; i++) {
//             if( arr[i] > max) {
//                 secondmax = max;
//                 max = arr[i];
                

               


//             }else if (arr[i] >  secondmax && arr[i]!=max ) {
//                 secondmax = arr[i];
//             }
            
//                 }
//                 if ( secondmax == Integer.MIN_VALUE ) 
//                 {
//                 System.out.println(-1);

//             }else{
//                 System.out.println("Second Largest " + secondmax);

//             }
                
                             
//         System.out.println("max : " + max);
        
//                     }
       

    


    
    
    

// }



import java.util.Scanner ;

public class JavaDemoQuestion {
    public static void main (String [] args ) {
        Scanner sc = new Scanner (System.in );
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        int i = 2;
       while ( i <num ) {
        i++;
        if ( num == 1 && num % i != 0  ) {
    System.out.println("Number is Prime ");

        }else {
            System.out.println("Number is not Prime");
        } 

       }
  sc.close();
        }
       
       

        
       
       
    }

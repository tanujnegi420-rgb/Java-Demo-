import java.util.Scanner;

public class SumofNum{
    public static void main (String [] args ){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0 ;
      for ( int i = 1 ; i <= num ; i++) {
     sum+=i;
        
      

      }
      System.out.println("Total Sum is : " + sum);
      sc.close();
      
 
        }
        
      }

    



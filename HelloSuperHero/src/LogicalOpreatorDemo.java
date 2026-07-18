import java.util.Scanner;
public class LogicalOpreatorDemo {
    public static void main ( String [] args) {
        Scanner sc = new Scanner(System.in ) ;
        System.out.print("Enter Your age : " ) ;
        int age = sc.nextInt();

        boolean haslisence = true;
         if(age>= 18 && haslisence == true ) {
            System.out.println("You can Drive! ");

         }else {
            System.out.println("You can't Drive!");

         }
         sc.close();
    }
 
}

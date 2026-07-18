import java.util.Scanner;
public class ConditionalDemo {
    public static void main( String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("How old are you : ") ;
        int Age = Scan.nextInt();

        if ( Age >= 18 ) {
            System.out.println("You can do the vote ") ;
        }else {
            int yearsleft = 18 - Age ;
            System.out.println("You can't do the vote  " + yearsleft + " more years left!");
        }
     Scan.close();


    }
    
}
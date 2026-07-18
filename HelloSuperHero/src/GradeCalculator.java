import java.util.Scanner;
public class GradeCalculator {
    public static void main ( String [] args) {
        Scanner GradeCal = new Scanner(System.in);

        System.out.print("Enter Your Grade : ") ;
        int Grade = GradeCal.nextInt();

        if ( Grade >= 90 ) {
            System.out.println("Congratualtion you got an S rank 🙌"); 

        }else if ( Grade >= 80 ) {
            System.out.println("Congratualtion you got an A Rank ");
        }else if ( Grade >= 60 ) {
            System.out.println("Congratualtion you got an B Rank ");
        }else if ( Grade >=40 ) {
            System.out.println("Congratualtion you got an C Rank ") ; 
        }else {
            System.out.println("Congratualtion you got an D Rank 🥲🥲🥲");
        }

        GradeCal.close();

    }
}
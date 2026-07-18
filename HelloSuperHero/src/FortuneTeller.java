import java.util.Scanner;
public class FortuneTeller {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;
         System.out.println("Welcome to Fortune Teller! : ");
         System.out.print("How are you feeling today? (happy/sad/tried/bored ) : ");
         String mood = sc.nextLine();

         String Fortune ;
         if( mood.equalsIgnoreCase(("happy")) ) {
            Fortune = "You will find a pot  of gold today ";
         }else if (( mood.equalsIgnoreCase(("sad")))) {
            Fortune = "Some one will give you a big hug " ;

         }else if ( mood.equalsIgnoreCase(("tried") ) ) {
            Fortune = "Take a nap - You deserve it! ";
         }else if (mood.equalsIgnoreCase("bored")){
            Fortune = " A suprise Adventure Coming in your way ";

         }else {
            Fortune = "I don't know that mood  ! I just know how to happy , sad , tried , bored";
         }

         System.out.println("Your Fortune "  + Fortune );
         System.out.println("Thank you for visiting Fortune Teller ");
         sc.close();

    }
 
}

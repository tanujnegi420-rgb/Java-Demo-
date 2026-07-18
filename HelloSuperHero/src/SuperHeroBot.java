import java.util.Scanner;
public class SuperHeroBot {
public static void main ( String [] args) {
    Scanner sc = new Scanner(System.in );

    System.out.println ( "Welcome SuperHeroBot is Activated ");

    System.out.print("What is your SuperHero name? : ");
    String name = sc.nextLine() ;
 
    System.out.print("What is your SuperPower? : ");
    String power = sc.nextLine();
    

    System.out.print("How many villains have u defeated? : ");
    int Villains = sc.nextInt();
     
    System.out.print("What is your power level(1 to 100) ? : ");
    int level = sc.nextInt();

    /// Calculate Power Level , Villians , ;
    int nextpowerlevel = level + 10 ;
    int noofvillains = Villains * 7 ;
    boolean TrueHero;
    if ( Villains >= 5 ) { 
        TrueHero = true;


    }else {
       TrueHero =  false ; 
    }

    System.out.println("Your Name : " + name );
    System.out.println("Your Power : " + power );
    System.out.println("Today Level : " + level );
    System.out.println("Today defeat : " + Villains );
    System.out.println("Next Power Level : " +nextpowerlevel);
    System.out.println("No of Villians Next week predicted : " + noofvillains);
    System.out.println("Are You True Hero : " + TrueHero);

sc.close();

}
}

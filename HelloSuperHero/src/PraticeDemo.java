import java.util.Scanner;
public class PraticeDemo {
public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    int[] score = new int[5];
    System.out.println("Enter Your Score : ") ;
    
    for ( int i = 0 ; i < score.length; i++ ) {
       
        System.out.print("Score " + (i+1) + " : " );
        score[i] = sc.nextInt();
    }

    int sum = 0 ; 
    int Highest = score[0];
    int Lowest = score[0];

    for ( int i = 0 ; i < score.length ; i++) {
        sum+=score[i];
        if ( score[i] > Highest ) {
            Highest = score[i];
        }
        if (score[i] < Lowest ) {
            Lowest = score[i] ;
        }
        
    }
    double Average = sum/ score.length ;

    System.out.println("=========RESULT==============");
    System.out.print("Score : ");
    for ( int scores : score) {
    System.out.println(scores + " ");
    
    
}

System.out.println("Sum : " + sum);
System.out.println("Highest : " + Highest );
System.out.println ( "Lowest : " + Lowest );
System.out.println("Average : " + Average);
System.out.println("=================================");
sc.close();
}
}

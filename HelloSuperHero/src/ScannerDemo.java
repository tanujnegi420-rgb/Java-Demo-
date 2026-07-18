import java.util.Scanner ;
public class ScannerDemo {
    public static void main (String [] args) {
        Scanner microphone = new Scanner (System.in);
       
       System.out.print("The Number u dial : " );
       int Number = microphone.nextInt();

     
       int whenDouble = Number*2;
       int whendsquare = Number*Number ;
       int whendivdedby3 = Number%3 ;
       System.out.println("When Number is doubled : " + whenDouble);
       System.out.println("When Number is Squared : " + whendsquare);
       System.out.println("When Number is Divide by 3 the remainder will be : " + whendivdedby3);
       microphone.close();

    }
}
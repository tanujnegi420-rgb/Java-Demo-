import java.util.*;
public class HeroCard {
    public static void main ( String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter age: ");
int age = sc.nextInt();   // Leaves \n behind!

System.out.print("Enter name: ");
String name = sc.nextLine(); // Skips! Reads the leftover \n
System.out.println(age);
System.out.println(name);
sc.close();
    }
}
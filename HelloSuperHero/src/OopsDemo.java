 public class OopsDemo {
    public static void main (String args[]) {
Horse h1 = new Horse();
System.out.println(h1.colour);
    }
 }

 class Animal {
    String colour;
    Animal () {
        System.out.println("Animal construction is called ");
    }
 } 
 class Horse extends Animal {
    Horse () {
         super(); // ye like na likhe farq nhi padta q ki java by default supper man leta ha aur print kar ta parent class constructor
        super.colour = "Brown";
       
        System.out.println("Horse Constructor is Called") ;
    }
 }
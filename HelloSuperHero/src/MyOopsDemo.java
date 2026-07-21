public class MyOopsDemo {
    public static void main (String [] args) {
        Student s1 = new Student();// this is object created from classs 

        s1.name = "Tanuj Negi"; //Each object has its own data
        s1.id = 12;
        s1.display();
        Student s2  = new Student();
        s2.name  = "Kiran negi";
        s2.id = 11;
        s2.display();



        Calculator c1 = new Calculator();
        System.out.println(c1.add(34, 4));
        c1.showMessage();

    }

}
 class Student { //this is class - Blue print of object the define data , method of object
    String name; // this is variable 
    int id;
    
    void display() { // This is method 
        System.out.println(id + " - " + name);
    }

}
class Calculator {
    int add ( int a , int b ) {
        return a+b;

    }
    void showMessage ()  {
        System.out.println("Hello Java!");

    }
}

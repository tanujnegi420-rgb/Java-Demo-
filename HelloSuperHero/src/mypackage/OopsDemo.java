package mypackage;

public class OopsDemo {
    public static void main (String args[]) {
        Deer d1 = new Deer();
        d1.eat();

    }
}

//Fuunction overriding part of run complier
//Method overriding -When parent and child class both has same function but differnt parameter ;

class Animal {
    String name;
    String colour;
    void eat() {
        System.out.println("It will eat anything");

    }
}
class Deer extends Animal {
    void eat() {
        System.out.println("It will eat grass");
    }
}

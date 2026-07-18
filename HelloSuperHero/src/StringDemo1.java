// import java.util.*;
public class StringDemo1 {
    public static void main ( String args[]) {
        // String str = " Hello ";
        // System.out.println(str.toLowerCase().trim().replace('h' , 'j'));
     String str = "Java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
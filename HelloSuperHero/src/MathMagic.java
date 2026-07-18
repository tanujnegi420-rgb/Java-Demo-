public class MathMagic  {
    public static void main (String [] args) {
        int apples = 36;
        int friends = 4;
        
        int eachGets = apples / friends ; // 36 divided by 4 = 9  ;
        int leftOver = apples % friends ; // 36 divided by 4 , remainder = 0 ;

        System.out.println("Each friends gets " + eachGets + " apples.");
        System.out.println("I have " + leftOver + " apple left for me! ");

    }
}
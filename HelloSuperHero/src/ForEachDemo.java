public class ForEachDemo {
    public static void main (String[] args) {
        int [] marks = { 89 ,54,76 , 54, 23 , 78 };

        // for each loop no need for index 
       for ( int score : marks ){
        System.out.println("marks is : " + score);
       }
    }

}

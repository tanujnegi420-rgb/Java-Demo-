import java.util.Scanner;

public class PasswordLoop {
    public static void main ( String[] args) {
        Scanner sc = new Scanner(System.in);
       

        String PassWord = "NegiPapa";
        String Enterpass ="";
///Loop start will from here 
        while (!Enterpass.equals(PassWord)) { // loop will continue until password is right !
             System.out.print("Enter Your Password : " ); // First enter password
             Enterpass = sc.nextLine();// Ask 
             
           
            
            if ( Enterpass.equals(PassWord)) { /// Check if it is true !
                System.out.println("Congratulation , Access Granted !");
                
            }else { // if not again loop !
                System.out.println("Wrong Password try Again! ");
            }
        }
        sc.close();
    }

}

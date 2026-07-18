import java.util.*;
public class StringDemo{
    public static void printletters ( String str) {
        for ( int i = 0 ; i < str.length() ; i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
    //is palindrome string 
    public static boolean isStringpalindrome ( String str) {
        int n = str.length();
        for ( int i = 0 ; i < n/2 ; i++) {
            if ( str.charAt(i)!= str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    //Shortest path 

    public static float shortestPath ( String str ) {
   int  x =  0 ;
   int  y = 0 ;
    for ( int i= 0 ; i < str.length() ; i++ ) {
        char dir = str.charAt(i);

        //south 
        if ( dir == 'W') 
            x--;
        else if ( dir == 'S')
            y--;
        else if ( dir == 'N') 
            y++;
        else
            x++;

    }
 float shortest = (float) Math.sqrt((x*x) + (y*y));
    return  shortest;
     
    }
public static String substring ( String str , int si , int ei ) {
    String substr  = "";
    for ( int i = si ; i< ei ; i++) {
        substr+=str.charAt(i);

    }
    return substr;
}

//Find largest in string array by lexiography 
public static String Largest ( String str[]) {
    String largest = str[0];
    for ( int i = 1 ; i< str.length ; i++) {
        if ( largest.compareToIgnoreCase(str[i] ) < 0) { // largest < str 
            largest = str[i];
        }
    }
    return largest ;
}
//Using String  uppper case  bhuat jyada time comeplexity tc ( n2)
public static String upperCase ( String str) {
    String str2  = new String( "");
    char ch = Character.toUpperCase(str.charAt(0));
    str2+=ch;

    for ( int i = 1 ; i < str.length() ; i++) {
        if ( str.charAt(i) == ' ' && i < str.length()-1) {
            str2+=str.charAt(i);
            i++;
            str2+=Character.toUpperCase(str.charAt(i));
        }else{
            str2+=str.charAt(i);
        }
    }
    return str2;
}

//Using String builder tc(n);
public static String upperCasebysb( String str) {
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for ( int i =1 ; i < str.length() ; i++) {
        if ( str.charAt(i) == ' ' && i< str.length()-1) {// last bracket 
            sb.append(str.charAt(i));// gap 
            i++; //+++
            sb.append(Character.toUpperCase(str.charAt(i))) ;/// upper case after braket


        } else {
            sb.append(str.charAt(i)) ;//nhi ha braket tooh print vaise ka vaise hi 
        }

    }
    return sb.toString();
}
///Compression ho va ji tc ( n)
public static String compression ( String str) {
    StringBuilder sb = new StringBuilder("");
    for ( int i = 0 ; i< str.length() ; i++) {
        Integer count = 1;
        while( i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
            count++;
            i++;

        }
        sb.append(str.charAt(i));
        if ( count > 1  ) {
            sb.append(count.toString());
        }

    }
    return sb.toString();
}
    public static void main (String args[]) {
        // char arr[] = { 'a' , 'v' , 'g' , 'b' }; //it can store chracter 
        // String str = "abcd"; // String store word or line 
        // String str2 = new String("abcdefdsj#%$@^@"); /// String can be store like this 

        // //String are immutable it can't be changed if once created

        Scanner sc = new Scanner ( System.in);
        // String name ;
        // name = sc.next(); // to print line sc.nextLine();
        // System.out.println(name);
        // System.out.println(name.length()); /// tell the length of wordssssss
   
        // //Contentation of String
        // String firstname= "Kiran";
        // String lastname = "Negi";

        // String fullname = firstname + " " +  lastname ;
        // System.out.println(fullname);
        // printletters(fullname);
        // String str = "race car";
        // System.out.println(isStringpalindrome(str));





        // /// String path to get shortest distance
        // String path = "SN";
        // System.out.println(shortestPath(path));
        


        // //Substring ]
        // String str = "HelloWorld";
        // System.out.println(substring(str, 02, 5));
        // System.out.println((str.substring(2,5)));  // auto mactic in built function |

        // ///Largest String
        // String fruits[] = { "apple" , "bannana" , "pineapple" , "apex" };
        
        // System.out.println(Largest(fruits));


        // StringBuilder sb = new StringBuilder("");
        // for ( char ch = 'a' ; ch<='z' ; ch++) {
        //    sb.append(ch); // ye agar stringbuilder jodna ha piche lagana ha toh .append 
        // }//abcdefghjklmnopqrstyz;
        // //big 0(n) ha esme ha
        // //big 0(n^2) in String 
        // System.out.println(sb);




        // ///Upper case
        // String str = "hi, i am tanuj negi ji ";
        // System.out.println(upperCase(str)); //upper case by using string 
        // System.out.println(upperCasebysb(str)); // uppper case using string builder 

////// String Compression using String Builder tc(n)
 String str = "abcccccccccccccccdddddeee";
 System.out.println(compression(str));

 

        sc.close();

    }
}








































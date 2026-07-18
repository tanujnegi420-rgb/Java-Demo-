import java.util.*;
public class LeetCode {
    public static boolean  isPalindrome ( int n ) {
        if ( n < 0 ||( n % 10 == 0 && n!=0) ){
            return false;
        }
        int reversehalf = 0 ; 
        while ( n > reversehalf) {
            reversehalf = reversehalf *10 + n%10;
            n/=10;

        }
        return n == reversehalf || n == reversehalf/10;
    }
//Using tc(n3);;

public static void threesum( int arr[]) {
    if ( arr == null || arr.length < 3)
        return;
    for ( int i = 0  ; i < arr.length-2 ; i++) {
        for ( int j = i+1 ; j < arr.length-1 ; j++ ) {
            for ( int k = j+1 ; k< arr.length ; k++) {
                
                if ((arr[i]!= arr[j] && arr[j]!=arr[k] && arr[i]!=arr[k] ) && ( arr[i] +arr[j] +arr[k] == 0 ) ) {
                    System.out.println("[" + arr[i] +","+ arr[j] + "," + arr[k] + "]");
                }
                
                }
            }
        }
        System.out.println();
    }

    public static int LeftOccurence ( int nums[] ,int target ) {
    int lp = 0;
    int rp = nums.length-1;
    int ans = -1;
    while ( lp <= rp ) {
        int mid = lp + ( rp -lp )/2;
        if ( nums[mid] == target) {
            ans = mid;
            rp = mid-1;
        }
        if ( nums[mid] <  target ) {
            lp = mid+1;

        }
    else{
        rp = mid-1;

    }

    }
    return ans ;
    }

public static boolean isAnagram ( String s1 , String s2) {
    if ( s1.length() != s2.length()) return false ;
    int freq[] = new int[26];
    
    for( int i = 0 ; i < s1.length() ; i++) {
        freq[s1.charAt(i) - 'a']++;
        freq[s2.charAt(i) - 'a']--;
    }

    for ( int v : freq) {
        if ( v != 0 ) {
            return false;
        }
    }
    return true;
}
public static int RomantoInt( String s ) {
    int ans = 0;
    int num = 0 ;
    int prev = 0 ;

for ( int i = s.length()-1 ; i>=0 ; i--) {
    switch(s.charAt(i)) {
        case 'I' : num = 1 ; break;
        case 'X' : num = 10; break;
        case 'V' : num = 5 ; break;
        case 'L' : num = 50 ; break;
        case 'C' : num = 100 ; break;
        case 'D' : num = 500 ; break;
        case 'M' : num = 1000 ; break;

    }
    if ( num >= prev) {
        ans+=num;
    }else{
        ans-=num;
    }
    prev = num;
}
return ans;
}
public static void removedublicate ( String str , int idex, StringBuilder newstr , boolean map[]) {
   
    // Base classs
    if ( idex == str.length()) {
        System.out.println(newstr);
        return; //Bhar 

    }
    char curr = (str.charAt(idex));
    if ( map[curr - 'a'] == true) {
        //Dublicate
        removedublicate(str, idex+1, newstr , map);
    }else {
        //NO dublicate before pasting 
        map[curr - 'a'] = true;
        newstr.append(str.charAt(idex));
        removedublicate(str, idex+1 ,newstr,map);

    }
}

public static int friendParing ( int n ) {
//Whenever there is paring try to use permutation or combination 
    
//Base Class --
if ( n == 1 || n ==2 ) return n;
return friendParing(n-1) + (n-1)* friendParing(n-2);
}
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        // System.out.println(isPalindrome(n));
        // int arr[] = {-1 , 0 ,1 , 2 , -1 , -4};
        // threesum(arr);

        // int nums[] = { 1, 2, 2 , 2 , 3 , 4 };
        // int target = 3;
       
        // System.out.println(isAnagram("silent", "listen"));
        // String s = "CMI";
        // System.out.println(RomantoInt(s));
        // String str = "appnacollege";
        // removedublicate(str, 0 ,new StringBuilder("") , new boolean[26]);
        System.out.println(friendParing(5));
        sc.close();

    }

}


public class BackTrackingDemo {
    public static void backtrackingarray(int nums[] , int i , int v) {
        if ( i == nums.length ) {
             for(int s : nums) {
            System.out.print(s + " ");
            
        }
        System.out.println();
            return;
        }

        nums[i] = v; //Upar jate jate addd kiya 
        backtrackingarray(nums, i+1, v+1);
        nums[i] = nums[i]-2;  // niche niche atae ate -2 ho jayege
       
    }
    public static void subset(String str , int i , String newstr ) {
       if ( i == str.length()){
         if ( newstr.length() == 0) {
            System.out.println("null");
         }
            System.out.println(newstr);
            return ;
        
       }
      //Recursion
      //Yes choice
        subset(str, i+1, newstr+(str.charAt(i)) );
        //No choice 
        subset(str, i+1, newstr);
    }
    public static void main ( String args[]) {
        // int nums[] = new int[5];
        // backtrackingarray(nums, 0, 1);
        // for(int s : nums) {
        //     System.out.print(s+ " ");
        // }


        String str  = "abcd";
        subset(str, 0, new String(""));


    }

}

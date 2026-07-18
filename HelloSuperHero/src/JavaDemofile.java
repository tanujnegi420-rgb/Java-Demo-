public class JavaDemofile {
    public static int firstoccrence(int nums[] , int target) {
        int s = 0;
         int e = nums.length-1;
         int ans = -1;
         while ( s <= e ) {
            int mid = s + ( e-s) /2;
            if (nums[mid] == target) {
                ans = mid;
                s = mid+1;

            }
            if ( nums[mid] > target) {
                e = mid-1;

            }
            else{
                s= mid+1;
            }
         }
         return ans;
    }
public static void Swapping( int a , int b ) {
 a = a^b;
 b = a^b;
 a = a^b;
  System.out.println(a );
  System.out.println(b);
}
    public static void main (String args[]) {
        // int nums[] = { 1 , 2, 2 , 2 , 3, 4 };
        // int target = 1 ;
        // System.out.println(firstoccrence(nums, target));
        Swapping(3, 6);
    }
}

public class Dividendconquere {
    public static void mergesort(int num[], int si , int ei ) {

        //Base case -
        if ( si >= ei ) return ;

        //mid 
        int mid = si + (ei-si )/2;

        
        //Merge Left half 
        mergesort(num , si , mid );
        //Merge Right half
        mergesort(num , mid+1 , ei );
        //after left and right then call merge function 
        merge(num , si , mid , ei );



    }
    public static void merge( int num[] , int si , int mid , int ei ) {
        //Make temp array 

        int temp[] = new int[ei-si+1]; //ei = n-1 ha , si = 0 , +1 total n ayega size of array 
     int i = si ; // left 
     int j = mid+1 ;//Right Part
     int k = 0 ; //for put to temp;

     while ( i <= mid && j <= ei ) {
        if( num[i] <=num[j]) {

            temp[k++] = num[i++];
        }else {
            temp[k++] =  num[j++];
        }

     }
     
        while ( i <= mid ) { //left oveer for left
            temp[k++] = num[i++];
        }
        while ( j <= ei ) { //left over for right 
            temp[k++] = num[j++];
        }


        //temp array to original 
        for ( k = 0 , i = si ; k < temp.length ; k++ , i++) {
        num[i] = temp[k];
        }
    }   
    //For Printing 
    public static void Printnum( int num[]) {
        for ( int i = 0 ; i < num.length ; i++) {
        System.out.print(num[i] + " ");
        }
    }

    public static void quicksort ( int nums[] , int si , int ei ) {
        if ( si >= ei ) {
            return ;

        }
         
        //last element 
        int pidx = partition (nums , si , ei );

        //left part 
        quicksort(nums, si, pidx-1);
        //Right part 
        quicksort(nums, pidx+1, ei);
    }
    public static int partition ( int nums[] , int si , int ei) {
        int pivot = nums[ei];
        int i = si-1;
        
        for ( int j = si ; j < ei ; j ++) {
            if( nums[j] <= pivot) {
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        i++;
        int temp = pivot ;
        nums[ei] = nums[i];
        nums[i] =temp;
        return i;
    }
    public static void main ( String args[]) {
        int nums[] = { 6 , 3, 9 , 5, 2, 8 };
      quicksort(nums, 0, nums.length-1);
      Printnum(nums);
       

    }
}

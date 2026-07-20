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

    //quick sort optimized Way to solve okkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk


    public static void QuickSortoptimized( int nums[] , int si , int ei ) {
        //Base case
        if ( si>= ei ) {
            return ;
        }

        //median of three
        median( nums , si , ei );

        /// Parition 
        int pidx = partitionOptimized(nums, si, ei) ;


        //quick sort for left 
            QuickSortoptimized(nums, si, pidx-1);

        // Quick sort for right 
        quicksort(nums, pidx+1, ei);
    }
    public static void median ( int nums[] , int si , int ei ) {
        int mid = si + ( ei - si )/2;

        //swap

        if ( nums[si] > nums[mid]) {
            swap(nums , si , mid);
        }
        if ( nums[si] > nums[ei]) {
            swap(nums , si , ei );
        }
        if ( nums[mid] > nums[ei]) {
            swap ( nums , mid , ei );
        }



        //Swap for right side is largest to pivot we don't need to check than right so we right this 
        swap( nums , mid , ei-1);
    }
    public static void swap( int nums[] , int i , int j ) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    public static int partitionOptimized ( int nums[] , int si , int ei ) {
        int pivot = nums[ei-1];
        int i = si-1;
    
        for ( int j = si ; j < ei-1 ; j++) {
            if ( nums[j] < pivot ) {
             i++;
             swap(nums , i , j);

            }

        }
        i++;
        swap(nums, i , ei-1);return i;
    }

    public static int searchrotatedarray ( int nums[] , int target ) {
        int si = 0 ;
         int ei = nums.length-1;
         while (si <= ei ) {
            int mid = si+ ( ei -si )/2;
            if ( nums[mid] == target) {
                return mid;
            }

            if ( nums[si] <= nums[mid]) {
                if ( nums[si] <= target && target < nums[mid]) {
                    ei = mid-1;

                }else {
                    si = mid+1;
                }
            }else {
                if ( nums[mid] < target && target <= nums[ei]) {
                    si = mid+1;

                }else {
                    ei = mid-1;
                }
                }
            }
            return -1;

         }





         ///Apply merge sort ot sort an array of String 
         public static void mergestring(String str[] , int si , int ei ) {
            if ( si>= ei ) {
                return ;
            }
            int mid = si + ( ei - si )/2;
            mergestring(str, si, mid);
            mergestring(str , mid+1 , ei );
            stringmerge(str , si , mid, ei ) ;
         }
         public static void stringmerge(String str[] , int si , int mid , int ei ) {
            String temp[] = new String[ei-si+1];
            int  i = si;
            int j = mid+1;
            int k = 0;

            while ( i <= mid && j <= ei) {
                if (str[i].compareTo((str[j]) )<= 0) {
                    temp[k++] = str[i++];
                }else{
                    temp[k++] = str[j++];
                }
            }
            while ( i <= mid) {
                temp[k++] = str[i++];

            }
            while(j <=ei) {
                temp[k++] = str[j++];
            }


            for ( k = 0  , i = si ; k < temp.length ; k++ , i++) {
                str[i] = temp[k];

            }
         }
         public static void printstring(String str[]) {
        
            for ( String s : str) {
                System.out.print(s + " ");
            }
            System.out.println();
         }
    
    public static void main ( String args[]) {
        // int nums[] = { 4 ,5  , 6 ,7 , 1 ,2 ,3  };
        // int target = 7;
        // System.out.println(searchrotatedarray(nums, target));
    //  partitionOptimized(nums, 0, nums.length-1);
    //   Printnum(nums);

    String str[] = {"sun" ,"earth" , "mars" , "mercury" };
    mergestring(str, 0, str.length-1);
    printstring(str);
       

    }
}

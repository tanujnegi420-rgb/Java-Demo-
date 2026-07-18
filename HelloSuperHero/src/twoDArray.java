import java.util.*;


public class twoDArray {
    public static boolean Search ( int matrix[][] , int key ) {
        for ( int i = 0 ; i < 3 ; i++) { // i < matrix.length
            for ( int j = 0 ; j < 3 ; j++) { // j < matrix[0].length ;
                if( matrix[i][j] == key) {
                    System.out.println( "key is found at : " + i + "," + j );
                    return true ;

                }
            }
            
        }
        System.out.println("key is not found");
            return false;
    }
    public static void largest ( int matrix[][]) {
        int max = Integer.MIN_VALUE;
        int rowIndex = -1;
        int colIndex = -1;

        for ( int i= 0 ; i< matrix.length ;i++) {
            for ( int  j= 0 ; j < matrix[i].length ; j++) {
                if ( matrix[i][j] > max) {
                    max = matrix[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }

        System.out.println("Max is : " + max);
        System.out.println("Max index is : (" + rowIndex + ", " + colIndex + ")");
    }
    public static void Smallest ( int matrix[][]) {
        int min = Integer.MAX_VALUE;
        int idexRow = -1;
        int idexCol = -1;
        for ( int i = 0 ; i < matrix.length ;i++) {
            for ( int j = 0; j < matrix[i].length ; j++) {
                if ( matrix[i][j] < min) {
                    min = matrix[i][j];
                    idexRow = i ;
                    idexCol = j;
                }
            }
        }
        System.out.println("Min is : " + min + " at index : " +  idexRow + "," + idexCol);
    }
    public static void spiral( int matrix[][]) {
        int SR = 0 , SC = 0;
        int ER = matrix.length-1 ,  EC = matrix[0].length-1;

        while ( SR <= ER && SC <= EC ) {
            //top part 
            for ( int j = SC ; j <=EC ; j++) {
                System.out.print(matrix[SR][j] + " ");
            }

            // Right Part ;
            for ( int i = SR+1 ; i <= ER ; i++ ) {
                System.out.print(matrix[i][EC] +" ");
            }

            // Bottom part 
            for ( int j = EC-1 ; j >=SC ; j--) {
                if ( SR == ER) { // dekh bhai batt ye ha ki same kya ha ER agar SR== ER mtlb dimag me soch SR aur ER toh ek hi line toh odd me kyu print karana toh breakokk

                    break;
                }
                System.out.print(matrix[ER][j] + " ");
            }
            //left part
            for ( int i = ER-1 ; i>= SR+1 ;i--) {
                if (SC == EC) {
                    break;
                }
                System.out.print(matrix[i][SC]+ " ");
            }
            SR++ ;
            SC++;
            ER--;
            EC--;

        }


    }
    public static int diagonalsum ( int matrix[][]) {
        int sum = 0 ;
         //tc big(n2)

        //  for ( int i = 0 ; i < matrix.length; i++) {
        //     for ( int j = 0; j < matrix[0].length ; j++ )  {
        //         if ( i == j ) {
        //             sum+=matrix[i][j];
        //         }
        //         if ( i+ j == matrix.length-1) {
        //             sum+= matrix[i][j];

        //         }
        //     }



        //tc big(n)


        for ( int i = 0 ; i < matrix.length; i++) {
            //ps -primary sum;
            sum+=matrix[i][i];
            //ss = secodary sum 
            if( i != matrix.length-1-i) //i is not equal to jjjjjjjjjjjjjjjj;
            sum+=matrix[i][matrix.length-1-i];

        }
         
         return sum;


    }
    public static boolean searchin2darray ( int matrix[][] , int key ){ // tc is big ( n+m)
        int row =  matrix.length-1 , col = 0;
        while( row >= 0 && col < matrix[0].length) {
            if ( matrix[row][col] == key ) {
                System.out.println("Key is found at index : " + row + "," + col);
                return true;
            }
            if ( matrix[row][col] > key ) {
            row--;
        }else 
            col++;
        

        }
        System.out.println("Key is not found ");
        return false;

    }
    
public static int repeat7s ( int matrix[][] , int key ) {
    int count =0 ;
    for (int i = 0 ; i < matrix.length; i++){
        for (int j = 0 ; j < matrix[i].length ; j++) {
            if ( matrix[i][j] == key ) {
                count++;
            }
        }

    }
    return count;
}
public static int Sumof2row ( int matrix[][]) {
    int sum = 0 ;
        for ( int j = 0 ; j < matrix[0].length ; j++) {
            sum+=matrix[1][j];
        
    }
    return sum;

}

public static void Transpose ( int matrix[][]) {//// 
    ///only work for suqare matrix okkk
    for ( int i = 0 ; i < matrix.length ; i++) {
        for ( int j = i+1 ; j< matrix[i].length ; j++){
            //swap 
            int temp = matrix[i][j];
            matrix[i][j]= matrix[j][i];
            matrix[j][i] = temp;
        }
    }
    
}
public static int[][] rectangluarTranspose ( int matrix[][]) {
    int row = matrix.length ;
    int col= matrix[0].length;

    int result[][] = new int[col][row];
    for ( int i =0 ; i < row; i++){
        for ( int j = 0 ; j  < col ; j++) {
            result[j][i] = matrix[i][j];
        }
    }
    return result;
}
public static void printTranspose ( int matrix[][]) {
    for ( int i = 0 ; i < matrix.length ; i++) {
        for ( int j =0 ; j< matrix[0].length ; j++) {
            System.out.print ( matrix[i][j] + " ");
        }
        System.out.println();
    }
}
    public static void main ( String args[]) {
        Scanner sc = new Scanner (System.in);
        // int matrix[][] =  { {  10 , 20 , 30 , 40 },
        //                     {15 , 25 , 35 , 45 } ,
        //                     { 27 , 29 , 37 , 48},
        //                     {32 , 33 ,39 , 50}};
int matrix[][] = { {1 , 4 , 9  } , 
                    { 11 , 4 , 3 },
                    {2  , 2 ,3 }};
        
        
        
    // largest(matrix);
    // Smallest(matrix);
    // System.out.println(Search(matrix , 4));
    // spiral(matrix);
//   System.out.println(diagonalsum(matrix));
// System.out.println(searchin2darray(matrix, 50));
// Transpose(matrix);  
// printTranspose(matrix);
//  int tranposed[][] = rectangluarTranspose(matrix);
// printTranspose(tranposed);
System.out.println(Sumof2row(matrix));

    sc.close();
  
    }

}
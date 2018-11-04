public class ArrayMethods{

   /*
   *PART 1
   */
   public static int rowSum(int[][] ary, int x){
     int result = 0;
     for (int i = 0; i < ary[x].length; i++) {
       result += ary[x][i];
     }
     return result;
   }
    //returns the sum of the elements in Row x of ary.

   public static int columnSum(int[][] ary, int x){
     int result = 0;
     for (int i = 0; i < ary.length; i++) {
       if (ary[i].length > x) {
         result += ary[i][x];
       }
     }
     return result;
   }
    //returns the sum of the elements in Column x of ary (careful with rows of different lengths!).

   /*
   *PART 2 - use prior methods where appropriate
   */
   public static int[] allRowSums(int[][] ary) {
     int[] rowSums = new int[ary.length];
     for (int i = 0; i < ary.length; i++) {
       rowSums[i] = rowSum(ary, i);
     }
     return rowSums;
   }
    //returns an array of the row sums for each row of ary.
    //Index i of the return array contains the sum of elements in row i.

    public static int[] allColSums(int[][] ary) {
      int longest = 0;
      for (int i = 0; i < ary.length; i++) {
        if (ary[i].length > longest) {
          longest = ary[i].length;
        }
      }
      int[] colSums = new int[longest];
      for (int i = 0; i < longest; i++) {
        int sum = 0;
        for (int x = 0; x < ary.length; x++) {
          if (ary[x].length < i) {
            sum += 0;
          } else {
            sum += ary[x][i];
          }
        }
        colSums[i] = sum;
      }
      return colSums;
    }
    //Returns an array with the column sum of each column of ary.
    //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
    //Index i of the return array contains the sum of elements in column i, ignoring any rows that are too short.
    //The length of the returned array should be the length of the LONGEST array in ary.


   /*
   *PART 3 - use prior methods where appropriate
   */
   public static boolean isRowMagic(int[][] ary){
     int[] toCheck = allRowSums(ary);
     for (int i = 0; i < toCheck.length - 1; i++) {
       if (toCheck[i] != toCheck[i+1]) {
         return false;
       }
     }
     return true;
   }
     //checks if the array is row-magic (this means that every row has the same row sum).

   public static boolean isColumnMagic(int[][] ary){
     int[] toCheck = allColSums(ary);
     for (int i = 0; i < toCheck.length - 1; i++) {
       if (toCheck[i] != toCheck[i+1]) {
         return false;
       }
     }
     return true;
   }
    //checks if the array is column-magic (this means that every column has the same column sum).

}

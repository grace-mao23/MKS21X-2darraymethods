public class Driver{
  public static String printOut(int[] ary) {
    String result = "[";
    for (int i = 0; i < ary.length; i++) {
      result += ary[i];
      if (i < ary.length - 1) {
        result += ", ";
      }
    }
    result += "]";
    return result;
  }

  public static void main(String[] args){
    int[][] ary = new int[][]{
      {5, 1, 2},
      {4, 3, 1, 7},
      {1, 8},
      {2, 3, 4, 5, 6},
      {},
      {3}
    };
    System.out.println("Printing sum of first row (should be 8)");
    System.out.println(ArrayMethods.rowSum(ary, 0));
    System.out.println("Printing sum of second row (should be 15)");
    System.out.println(ArrayMethods.rowSum(ary, 1));
    System.out.println("Printing sum of third row (should be 9)");
    System.out.println(ArrayMethods.rowSum(ary, 2));
    System.out.println("Printing sum of fourth row (should be 20)");
    System.out.println(ArrayMethods.rowSum(ary, 3));
    System.out.println("Printing sum of fifth row (should be 0)");
    System.out.println(ArrayMethods.rowSum(ary, 4));
    System.out.println("Printing sum of sixth row (should be 3)");
    System.out.println(ArrayMethods.rowSum(ary, 5));

    System.out.println();

    System.out.println("Printing sum of first column (should be 15)");
    System.out.println(ArrayMethods.columnSum(ary,0));
    System.out.println("Printing sum of second column (should be 15)");
    System.out.println(ArrayMethods.columnSum(ary,1));
    System.out.println("Printing sum of third column (should be 7)");
    System.out.println(ArrayMethods.columnSum(ary,2));
    System.out.println("Printing sum of fourth column (should be 12)");
    System.out.println(ArrayMethods.columnSum(ary,3));
    System.out.println("Printing sum of fifth column (should be 6)");
    System.out.println(ArrayMethods.columnSum(ary,4));

    System.out.println();

    System.out.println("Printing array with all row sums");
    System.out.println("Should print [8, 15, 9, 20, 0, 3]");
    System.out.println(printOut(ArrayMethods.allRowSums(ary)));

    System.out.println();

    System.out.println("Printing array with all column sums");
    System.out.println("Should print [15, 15, 7, 12, 6]");
    System.out.println(printOut(ArrayMethods.allColSums(ary)));
  }
}

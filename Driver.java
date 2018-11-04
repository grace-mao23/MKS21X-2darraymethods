public class Driver{
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
  }
}

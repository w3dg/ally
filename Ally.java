package ally;

public final class Ally {
  /*
   * Don't let anyone instantiate this class.
   */
  private Ally() {
  }
  
  // print elements of arrays
  public static void printArray(int[] arr) {
    for (int x : arr)
      System.out.println(x);
  }

  public static void printArray(String[] arr) {
    for (String x : arr)
      System.out.println(x);
  }

  public static void printArray(float[] arr) {
    for (float x : arr)
      System.out.println(x);
  }

  public static void printArray(double[] arr) {
    for (double x : arr)
      System.out.println(x);
  }

  public static void printArray(char[] arr) {
    for (char x : arr)
      System.out.println(x);
  }
}

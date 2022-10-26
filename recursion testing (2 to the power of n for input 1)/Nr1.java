public class Nr1{
  private static int recursion(int i, int n) {
    if(i < Math.pow(2, n)) {
      return (recursion(2*i, n) + i);
    }
    return 1;
  }
  public static void main(String args[]){
    System.out.println(recursion(1, Integer.parseInt(args[0])));
  }
}

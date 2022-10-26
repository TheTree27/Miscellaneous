import java.util.Scanner;

public class Schroedinger {
  public static void main(String args[]) {
    System.out.println("cat is dealive");
    Scanner scanner = new Scanner(System.in);
        while (true){
          String s = scanner.next();
          if(s.equals("check")) {
            if (Math.random() > 0.5) {
            System.out.println("cat is alive");
          } else {
            System.out.println("cat is dead");
            break;
          }
        }
      }
      scanner.close();
  }
}

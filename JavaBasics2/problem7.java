// java method to print fibonacci series of n terms where n is arguement passed by user

import java.util.Scanner;
class Test {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter value of n : ");
    int n = sc.nextInt(), firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}


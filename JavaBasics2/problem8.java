// java method to print Factorial of n arguement passed by user
import java.util.Scanner;
class Test {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter value of n : ");
    int n = sc.nextInt(), fact =1;
    for (int i = 1; i <= n; i++) {
    	fact =fact*i;
    }
    System.out.print("Factorial of "+ n +" is :" + fact);
  }
}


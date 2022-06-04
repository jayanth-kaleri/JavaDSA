//Java Program - Find Smallest of Three Numbers

 
public class SmallestInThree {
 
    public static void main(String[] args) {
        //three numbers
        int a = 20;
        int b = 10;
        int c = 30;
         
        int smallest;
         
        if(a<b && a<c) {
            smallest = a;
        } else if (b<c) {
            smallest = b;
        } else {
            smallest = c;
        }
         
        System.out.println(smallest + " is the smallest.");
    }
}

//Java program that takes a number as input and prints its multiplication table upto 10.

import java.util.Scanner;

class problem2 {
    
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        
        for(int i=0;i<10;i++){
            System.out.println(num+" X "+ i +" = "+ (num*(i+1)));
        }
    }
     
}

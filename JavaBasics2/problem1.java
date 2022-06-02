// A Java program to print elements which are
// greater than avg of array
import java.io.*;

class problem1 {
    static void printAboveAvg(int arr[], int n){
        double avg = 0;
        for(int i=0;i<n;i++)
            avg+=arr[i];
        avg = avg/n;
        
        //print the elements greater than average
        for (int i = 0;i<n;i++)
            if(arr[i]>avg)
                System.out.print(arr[i] + " ");
        System.out.println(avg);  
    }
    public static void main(String[]args){
        int arr[] ={5,4,6,9,10};
        int a = arr.length;
        printAboveAvg(arr,a);
    }
     
}

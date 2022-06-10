package Arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		int arr[] =new int[] {45,67,13,56,99,45,24,75,34};
		int min = arr[0];
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("small number in array is : " + min);
	}

}

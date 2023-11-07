package Phase1Module3;

import java.util.Arrays;

public class FourthSmallestElement {
	public static void main(String[] args) {
		int arr[] =new int[]{9, 3, 6, 1, 7, 5, 2, 8, 4};
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		int fourthSmallest = arr[3];
		System.out.println(" ");
		System.out.println("Fourth smallest element: " + fourthSmallest);


	}
}

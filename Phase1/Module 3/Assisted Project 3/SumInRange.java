package Phase1Module3;

import java.util.Scanner;

public class SumInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
		int n = array.length; 

		System.out.print("Enter the value of L: ");
		int L = sc.nextInt();

		System.out.print("Enter the value of R: ");
		int R = sc.nextInt();

		if (L <= 0 || R >= n || L > R) {
			System.out.println("Invalid range!");
		} 
		else {
			int sum = 0;
			for (int i = L; i <= R; i++) {
				sum += array[i];
			}
		    System.out.println("Sum of elements in the range [" + L + ", " + R + "] is: " + sum);
		}


	}

}

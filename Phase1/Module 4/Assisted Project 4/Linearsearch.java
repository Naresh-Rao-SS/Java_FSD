package Phase1Module4;

import java.util.Arrays;
import java.util.Scanner;

public class Linearsearch {
	public static void main(String[] args) {
		int a[]=new int[]{6,5,7,3,1,0,15};
		Arrays.sort(a);
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the value to be searched");
		int key=0;
		key=input.nextInt();
		
		int Flag=0;
		int i =0;
		
		for(i=0;i<a.length;i++) {
			if(a[i]==key) {
				Flag=1;
				break;
			}
			else {
				Flag=0;
			}
		}
		if(Flag==1) {
			System.out.println("Found bro at location " +i);
		}
		else {
			System.out.println("Not found Bro, Try Again !!");
		}
		
	}
}

package Phase1Module4;

import java.util.Arrays;
import java.util.Scanner;

public class BInarySearch {
	public static void main(String[] args) {
		int a[]=new int[] {6,5,11,2,1,7,8,12};//unsorted 
		Arrays.sort(a);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("the sorted array is ");
		for(int i:a) {
			System.out.print(i+"   ");
		}
		
		System.out.println();
		System.out.println("enter the key vlaue to search");
		
		int key=sc.nextInt();
		int flag=0;
		int low=0;
		int high=a.length-1;
		int mid=0;
		mid=(low+high)/2;	
		System.out.println("The middle value is "+mid);
		
		while(low<=high) {					//low = start of index 
			mid=(low+high)/2;				//high= end of index	
			if(a[mid]==key){				//mid=middle value of index 
				flag=1;
				break;
			}
			else if(a[mid]<key){
				low=mid+1;
			}
			else if(a[mid] > key){
				high=mid-1;
			}
		}

		if(flag==1) {
			System.out.println("element is found at index "+mid);
		}
		else {
			System.out.println("element is not found ");
		}


	}
}

package Phase1;

import java.util.Scanner;

public class Emailvalidation {
	static boolean isValid(String email) {
		String matchingkeywords="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(matchingkeywords);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String email;
		int i;
		for(i=0;i<=3;i++) {
			System.out.println("Give me you Email address ");
			email=s.next();
			
			System.out.println("Your email "+email);
			System.out.println();
			System.out.println("Is it valid! "+isValid(email));
			System.out.println();
		}
	}
}

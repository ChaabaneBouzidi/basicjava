package corejava;

import java.io.StringReader;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original,reverse="";
		Scanner input= new Scanner(System.in);
		System.out.println("enter a name");
		original=input.nextLine();
		int length=original.length();
		for(int i=length-1;i<=0;i--) {
			reverse=reverse +original.charAt(i);
			if (original.equals(reverse))
			System.out.println(" the name " + original + " is Palindrom");
			else 
				System.out.println(" the name " + original + " is not Palindrom");	
		
				
		}
		
	}

}

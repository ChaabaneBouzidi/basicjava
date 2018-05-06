package corejava;

import java.util.Scanner;

public class First_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a,b,i;
	Scanner input = new Scanner(System.in);
		System.out.println("enter the first and the last number");
		a=input.nextInt();
		b= input.nextInt();
		for (i=a;i<=b;i++) {
			System.out.println(i);
			
		}
		
		
	}

}

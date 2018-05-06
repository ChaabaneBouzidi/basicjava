package corejava;

import java.util.Scanner;

public class second_question {
//Ask the user for a sentence and print each words one by one 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		System.out.println("write a sentence");
		String phrase= input.nextLine();
	String[] arr = phrase.split(" ");
	//for (int i=0; i<=arr.length-1;i++) {
	//	System.out.println(arr[i]);
	//}
	for(String phrase1: arr) {
		System.out.println(phrase);
	}	
	
	
	
	}
}
	



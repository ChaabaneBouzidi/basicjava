package corejava;

import java.util.Scanner;

public class Mainmath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Mainmath operations= new Mainmath();
Mathfun calculation = new Mathfun();

Scanner input = new Scanner(System.in);
    System.out.println("enter a number please ");
     int x = input.nextInt();
		Scanner input2 = new Scanner(System.in);
	System.out.println("which operation do you want to make");
	 String b = input2.nextLine();
		
		if(b.equalsIgnoreCase("square")) {
			System.out.println(calculation.square(x));
		}
			else if (b.equalsIgnoreCase("cube")) { 
				System.out.println(calculation.cube(x));
		}
		
	}
}
	


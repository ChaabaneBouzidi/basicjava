package Iphone_siri;

import java.util.Scanner;

public class Principal_program extends Calculation{
static int a;
static int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
		System.out.println("Ask me your question");
		String search = input.nextLine();
		Principal_program calc=new Principal_program();
		try {
		switch(search)  {
		case "calculation":
			Scanner reader = new Scanner(System.in);	
			System.out.println("give me the first number");
			int a = reader.nextInt();
			System.out.println("give me the second number");
			int b = reader.nextInt();
			calc.addition(a, b);
			calc.substraction(a, b);
			calc.division(a, b);
			calc.multiplication(a, b);
			break;
		case "weather":
			
			break;
		case "today date":
			
			break;
		case "roads conditions now":
			
			break;
			default:
				System.out.println("specify your search please");
		
		}
		}catch(Exception e) {
			System.out.println("i don't understand what are you trying to do");
		}
		}
		
		
		
	}



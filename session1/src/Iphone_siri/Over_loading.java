package Iphone_siri;

public class Over_loading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	numbers(1);	
	numbers(5.6);		
	add(7,8);	
	add(7,8,6);	
		
	}

	public static void numbers (int a) {
		System.out.println(a);
	}
	public static void numbers (double a) {
		System.out.println(a);
	}	
	
	public static void add(int a, int b) {
	int addition= a+b;
		System.out.println(addition);
	
	}
	
	public static void add(int a, int b, int c) {
		int addition= a+b+c;
			System.out.println(addition);
	}
	public static void add(int a, int b, int c, int d, int e) {
		int addition= a+b+c+d+e;
			System.out.println(addition);
	}
	
	}
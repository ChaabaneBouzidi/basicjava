package Iphone_siri;


public class Calculation {

//public static void main(String[] args) {
	
public static void addition(int a ,int b) {
	int add=a+b;
	System.out.println(add);
}
public static void substraction( int a, int b) {
	int sub=a-b;
	System.out.println(sub);

}
public static void division(int a, int b) {
	try {
	double div=a/b;
	System.out.println(div);

} catch (ArithmeticException e) {
	System.out.println("try for number ");
	}
}
public static void multiplication(int a, int b) {
	int mul=a*b;
	System.out.println(mul);

}
}
//}
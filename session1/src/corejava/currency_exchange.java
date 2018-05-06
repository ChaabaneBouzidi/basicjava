package corejava;
import java.util.Scanner;
public class currency_exchange {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
String currency;
double d;
double e;
double val;
Scanner input=new Scanner(System.in);

System.out.println("enter a value");
val= input.nextDouble();

System.out.println("Select your currency: USD or EUR");
currency=input.next();

if(currency.equals("USD"))
  {
	e=val*0.7368;
	e=Math.round(e)*100.0/100.0;
	System.out.println(val+" USD= "+e+" EUR ");
  }
else if(currency.equals("EUR"))
  {
	d=val*1.6345;
	d=Math.round(d)*100.0/100.0;
	System.out.println( val +"EUR= "+d+" USA ");
  }
				
	}

}

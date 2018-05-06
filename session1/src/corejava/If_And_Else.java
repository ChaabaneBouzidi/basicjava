package corejava;

public class If_And_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=300;
int j=200;
int a=300;

//String i="john";
//Operators in java= <,>,=,<=,>=,!
if (i<j)// condition
	System.out.println("i is less then j");
else 
	System.out.println("i is not less then j");

if (i < a)
	System.out.println("i is less then a");
else
	System.out.println("i is not less then a");
//if you are comparing two variable you need to put ==.
//if you are assigning a value to variable put just =.
if (i==a)
	System.out.println("value of i and a are a same");
else
	System.out.println("value of i and a are not same");

//if (j>a)
	//System.out.println("j is greater then a");
if (j<a)
{
	System.out.println("j is graeter then a");

}
else
{
	System.out.println("j is not graeter then a");
}
if (!(i==a))// not equal example
{
	System.out.println("value of i and a are not equal");
}

else
{
	System.out.println("value of i and a are equal" + "value of i is" +i);

}
String name="john";
String name1="michael";
if (name==name1)
{
	System.out.println("both of the names are same");
}
else

	System.out.println("both of the names are not same");





		
	}

}

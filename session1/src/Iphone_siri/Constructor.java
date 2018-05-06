package Iphone_siri;
// construction is an instance method that usually has the same name as class
// and is used for assigning a new default value
// constructor should be always non static
// static variable can not be a constructor
public class Constructor {
int age;
int salary;
int house;
String name;
	Constructor(){
		int age=47;
		int salary=10000;
		int house=7;
				String name="john";
				System.out.println(age);
				System.out.println(salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor x = new Constructor();
		//System.out.println(x.age);
		
	}

}

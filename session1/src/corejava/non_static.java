package corejava;

public class non_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
non_static x=new non_static();
//instance of an object
x.car();
x.flower();
	}
	
public void car() {// non static function
System.out.println("toyota");	
}	
public void flower() {
	System.out.println("i like rose");	
}	
}

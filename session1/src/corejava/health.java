package corejava;

public class health {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int weight=200;
		switch (weight) {
		case 100:
			System.out.println("need to take care for your health");
			break;
		case 150:
			System.out.println("you're good ");
			break;
		case 200:
			System.out.println("your health in risk");
			break;
			default:
				System.out.println("i don't know");
		}
	
		System.out.println();
	}

}

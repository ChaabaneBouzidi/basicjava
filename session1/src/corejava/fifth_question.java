package corejava;

import java.util.Scanner;

public class fifth_question {
// if the name which the user put is exist, the system display that is exist else display is not exist
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[10];
		names[0]= "james";
		names[1]= "tim";
		names[2]= "david";
		names[3]= "paul";
		names[4]= "justin";
		names[5]= "jordon";
		names[6]= "sami";
		names[7]= "susan";
		names[8]= "illia";
		names[9]= "shama";
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the name: ");
	    String firstname= input.nextLine();
		
	    
	    int count=0;
	    for (int i=0;i<names.length-1; i++) {
	    
	    	if (firstname.equalsIgnoreCase(names[i])) { 
		
	    count++;
	    }
	    }
	    	if (count==0) {
	    	    System.out.println(firstname+" is not exist");	
	    		}
	    else {
	        System.out.println(firstname+" is already exist");
	         }
	         }
	}



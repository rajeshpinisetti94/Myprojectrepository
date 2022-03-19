package assignments;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		
		System.out.println("enter number");
		
	int num; 
	Scanner s = new Scanner (System.in); 
	num= s.nextInt();
	
	for ( int a=1; a<=10; a++ ){
			
			System.out.println(num + "*" + a +"=" +(num*a));
	
	
	}
	
	
	}
}

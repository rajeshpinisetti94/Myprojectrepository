package corejava;

import java.util.Scanner;

public class Scannersample {

	public static void main(String[] args) {
	
		int num;	
		   Scanner s= new Scanner (System.in);
		   num = (s.nextInt());					   
			for ( int a=1; a<=10; a++ )
			
			System.out.println(num + "*" + a +"=" +(num*a));
	
	}

}

package corejava;

public class Conditional_statement {

	public static void main(String[] args) {
	
		int a = 100;
		
		if(a>0 && a<=2) {
			System.out.println("infant");
		}
		else if (a>2 && a<=12) {
			System.out.println("child");
		}
		else if (a>12 && a<=25) {
		System.out.println("youth");
		}
		else if (a>25 && a<=45) {
			System.out.println("adult");
		}
			else if (a>45 && a<=100) {
				System.out.println("seniorcitizen");
			}	
			else 
				System.out.println("enter 0 to 100");
	}

}

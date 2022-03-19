package corejava;

public class Stringsample {

	public static void main(String[] args) {
		
		String j = "Apple";
		String k = "apPLe";
		
		// Length: always start from 1(one) onwards
		System.out.println(j.length());
		// Index: always start from 0(zero) onwards
		System.out.println(k.charAt(3));

		if (j.equals(k)) {
			System.out.println("Both are  equal");

		} else {
			System.out.println("Both are not equal");
		}
	
			System.out.println("Both are not equal********");
			
			
			System.out.println("####################################");
			
			String h = "Rajeshhhhh";
			if (j.equalsIgnoreCase(h)) {
				System.out.println("Both are  equal********");

			} else {
				System.out.println("Both are not equal********");
	}

	}
}

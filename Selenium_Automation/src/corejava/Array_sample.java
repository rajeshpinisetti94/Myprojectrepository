package corejava;

public class Array_sample {

	public static void main(String[] args) {
				
		String [] a ={"abbc","ca","ra"};
		int [] b = {555,444,333,2};
		
		System.out.println(a.length);
		System.out.println(b.length);
		
		for ( int i : b){
		System.out.println(i+"  ");
		}
		System.out.println("********************");
		
		for (int i =0; i< b.length; i++)

			System.out.println(b[i] + " ");
		
		for (String x :a)
				System.out.println(x +" ");
		
		
		
		
	}

}

package corejava;

public class Oops_inheretance_child {
	
	
public static void mul () {
	
			int d= 1000;
			int e= 50;
			System.out.println(d*e);


}
	public static void main(String[] args) {
			
		Oops_inheretance_parent abc= new Oops_inheretance_parent();
		
		mul();
		abc.add();
		abc.sub();
		
		
	}

}

package N1Ex5;

public class N1Ex5 {
	
	public static void main (String[]args) {
		
		
		FuncInterface functionalInterface = () -> 3.1415;
		
		System.out.println("Pi number = " + functionalInterface.getPiValue());
		
	}

}

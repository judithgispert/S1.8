package N1Ex8;

public class N1Ex8 {
	
	public static void main (String[]args) {
		
		FuncInterface reverseStr = (str) -> {
			String resultReverse = "";
			for (int cont = str.length()-1; cont >= 0; cont--) {
				resultReverse += str.charAt(cont);
			}
			return resultReverse;
		};
		
		System.out.println(reverseStr.reverse("judith"));
	}

}

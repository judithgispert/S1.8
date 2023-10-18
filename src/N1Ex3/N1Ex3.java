package N1Ex3;

import java.util.Arrays;
import java.util.List;

public class N1Ex3 {
	
	public static void main (String[]args) {
		
		List<String> monthList = Arrays.asList("January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December");
		
		monthList.forEach(i -> System.out.println(i));
		
	}

}

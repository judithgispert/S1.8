package N2Ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class N2Ex2 {
	
	public static void main (String[]args) {
		
		List <Integer> intList = Arrays.asList(2, 9, 43, 516, 87);
		
		numsEO(intList);
				
		
	}
	
	public static void numsEO (List<Integer> intList) {
		List <String> printList = new ArrayList<String>();
		
		for (Integer num : intList) {
			if(num%2 == 0) {
				printList.add("e"+num);
			}else {
				printList.add("o"+num);
			}
		}
		System.out.println(printList.stream().collect(Collectors.joining(", ")));
	
	}
}

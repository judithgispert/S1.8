package N1Ex6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class N1Ex6 {
	
	public static void main (String[]args) {
		
		List<String> stringList = Arrays.asList("Joan", "22", "Green flower", "Alex", "13", "8453791");
	
		stringList.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

	}

}


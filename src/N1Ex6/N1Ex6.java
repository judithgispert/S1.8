package N1Ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class N1Ex6 {
	
	public static void main (String[]args) {
		
		List<String> stringList = Arrays.asList("Joan", "Green flower", "Alex", 
				Integer.toString(13), Integer.toString(22), Integer.toString(8453791));
		
		stringList.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

	}

}


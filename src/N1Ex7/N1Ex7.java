package N1Ex7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class N1Ex7 {
	
public static void main (String[]args) {
		
		List<String> stringList = Arrays.asList("Joan", "22", "Green flower", "Alejandra", "9", "84791");
	
		Stream <String> streamStrings = stringList.stream().sorted(Comparator.comparing(String::length).reversed());
		
		streamStrings.forEach(i -> System.out.println(i));

	}

}

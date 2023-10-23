package N2Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class N2Ex1 {
	
	public static void main (String[]args) {
		
		List <String> stringList = Arrays.asList("Alex", "Marta", "Ariadna", "Ana", "Mar", "Pau", "Claudia");
		
		
		System.out.println(filterStr(stringList).collect((Collectors.toList())));
		
	}

	public static Stream<String> filterStr (List<String> stringList) {
		Stream <String> streamStrings = stringList.stream()
				.filter(l -> l.startsWith("A"))
				.filter(l -> l.length() == 3);
		return streamStrings;
	}
}

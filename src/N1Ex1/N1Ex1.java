package N1Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class N1Ex1 {
	
	public static void main (String[]args) {
		
		List <String> stringList = Arrays.asList("Phone", "Computer", "Bed", "Order", "Sun");
		Stream <String> streamStrings = stringList.stream().map(l -> l.toUpperCase()).filter(o -> o.contains("O"));
		
		
		System.out.println(streamStrings.collect((Collectors.toList())));
		
	}

}

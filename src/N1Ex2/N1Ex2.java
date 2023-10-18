package N1Ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class N1Ex2 {
	
public static void main (String[]args) {
		
		List <String> stringList = Arrays.asList("Phone", "Computer", "Out", "Basketball",
				"Bed", "Order", "Sun", "Juice", "Number");
		
		Stream <String> streamStrings = stringList.stream()
				.map(l -> l.toUpperCase())
				.filter(o -> o.contains("O"))
				.filter(o -> o.length() > 5);
		
		
		System.out.println(streamStrings.collect((Collectors.toList())));
		
	}

}

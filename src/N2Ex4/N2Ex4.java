package N2Ex4;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class N2Ex4 {
	
	public static void main (String[]args) {
		
		List<String> mixList = Arrays.asList("83", "Polar", "Cinema", "209", "Purple",
				"0", "File", "Active", "41");
		
		System.out.println("ORDER BY CHAR");
		orderByChar(mixList);
		
		System.out.println();
		
		System.out.println("ORDER CONTAINS E FIRST");
		orderByE(mixList);
		
		System.out.println();
		
		System.out.println("MODIFY A -> 4");
		letterToNum(mixList);
		
		System.out.println();
		
		System.out.println("ONLY NUMBERS");
		filterNum(mixList);
		
	}
	
	public static void orderByChar (List<String>mixList) {
		
		Comparator <String> compareString = (s, n) -> {
			int returnCompare = 0;
			if ((s.charAt(0)) < (n.charAt(0))) {
				returnCompare = -1;
			}else if ((s.charAt(0)) > (n.charAt(0))){
				returnCompare = 1;
			}
			return returnCompare;
		};
	
		mixList.stream().sorted(compareString).collect(Collectors.toList()).forEach(System.out::println);
	}
	
	public static void orderByE (List<String>mixList) {
		
		Comparator <String> compareString = (s, n) -> {
			int returnCompare = 0;
			if (s.contains("e") && !n.contains("e")) {
				returnCompare = -1;
			}else if (!s.contains("e") && n.contains("e")) {
				returnCompare = 1;
			}
			return returnCompare;
		};
	
		mixList.stream().sorted(compareString).collect(Collectors.toList()).forEach(System.out::println);
	}
	
	public static void letterToNum (List<String>mixList) {
		mixList.stream().map(l -> l.replace('a', '4')).map(l -> l.replace('A', '4'))
			.collect(Collectors.toList()).forEach(System.out::println);
	}
	
	public static void filterNum (List<String>mixList) {
		mixList.stream().filter(l -> l.chars().allMatch(Character::isDigit))
			.collect(Collectors.toList()).forEach(System.out::println);
	}
	
	

}

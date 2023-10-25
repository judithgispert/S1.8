package N3Ex1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class N3Ex1 {
	
	public static void main (String[]args) {
		
		ArrayList <Student> studentsList = new ArrayList<Student>();
		
		studentsList.add(new Student("Raquel", 29, "JAVA", 8.3));
		studentsList.add(new Student("Alex", 17, "JAVA", 4.9));
		studentsList.add(new Student("Max", 26, "REACT", 3.2));
		studentsList.add(new Student("Aria", 23, "JAVA", 7.5));
		studentsList.add(new Student("Oriol", 27, "JAVA", 4.2));
		studentsList.add(new Student("Nuria", 43, "REACT", 5.3));
		studentsList.add(new Student("Marga", 39, "PHP", 6.9));
		studentsList.add(new Student("Jordi", 25, "PHP", 7.7));
		studentsList.add(new Student("Joan", 25, "JAVA", 9.3));
		studentsList.add(new Student("Isabel", 28, "PHP", 1.2));
		
		System.out.println("STUDENTS LIST");
		nameAgeList(studentsList);
		System.out.println();
		
		System.out.println("STUDENTS NAME STARTS WITH A LIST");
		nameWithA(studentsList);
		System.out.println();
		
		System.out.println("MARK >= 5");
		markSup(studentsList);
		System.out.println();
		
		System.out.println("MARK > 5 + NO PHP");
		markNoPhp(studentsList);
		System.out.println();
		
		System.out.println("JAVA >= 18 YEARS OLD");
		javaAge(studentsList);
		
	
	}
	
	public static void nameAgeList (ArrayList<Student> studentsList) {
		studentsList.stream().forEach(s -> System.out.println("Student name: " + s.getName() 
							+ " / Age: " + s.getAge()));
	}
	
	public static void nameWithA (ArrayList<Student> studentsList) {
		ArrayList<Student> studentsNameA = new ArrayList<Student>();
		
		studentsNameA = (ArrayList<Student>) studentsList.stream().filter(s -> s.getName().startsWith("A"))
						.collect(Collectors.toList());
		studentsNameA.forEach(s -> System.out.println(s));
	}
	
	public static void markSup (ArrayList<Student> studentsList) {
		studentsList.stream().filter(s -> s.getMark() >= 5).forEach(s -> System.out.println(s));
	}
	
	public static void markNoPhp (ArrayList<Student> studentsList) {
		studentsList.stream().filter(s -> s.getMark() >= 5).filter(s -> s.getCourse() != "PHP")
						.forEach(s -> System.out.println(s));
	}
	
	public static void javaAge (ArrayList<Student> studentsList) {
		studentsList.stream().filter(s -> s.getCourse() == "JAVA").filter(s -> s.getAge() >= 18)
						.forEach(s -> System.out.println(s));
	}

}

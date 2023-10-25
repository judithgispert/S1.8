package N2Ex3;

public class N2Ex3 {
	
	public static void main (String[]args) {
		
		FunctionalInterfaceOp additionOperation = (num1, num2) -> {
			return num1 + num2;
		};
		FunctionalInterfaceOp subtractionOperation = (num1, num2) -> {
			return num1 - num2;
		};
		FunctionalInterfaceOp multiplicationOperation = (num1, num2) -> {
			return num1 * num2;
		};
		FunctionalInterfaceOp divisionOperation = (num1, num2) -> {
			return num1 / num2;
		};
		
		System.out.println(additionOperation.operation(2.3f, 6.7f));
		System.out.println(subtractionOperation.operation(5.8f, 1.9f));
		System.out.println(multiplicationOperation.operation(3.4f, 2.2f));
		System.out.println(divisionOperation.operation(8.5f, 0.5f));
		
	}

}

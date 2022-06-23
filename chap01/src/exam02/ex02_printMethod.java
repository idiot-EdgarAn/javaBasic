package exam02;

public class ex02_printMethod {

	public static void main(String[] args) {
		int value = 10;
		System.out.printf("%d\n", value);
		System.out.printf("%6d\n", value);
		System.out.printf("%-6d\n", value);
		System.out.printf("%06d\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
		
		String name = "Edgar";
		String job = "Programmer";
		System.out.printf("%6d : %-10s : %10s\n", 1, name, job);
	}

}

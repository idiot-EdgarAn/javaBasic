package exam02;

import java.util.Scanner;

public class ex04_scanner {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력값 : \"" + inputData + "\"");
			
			if(inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("종료");
		
		
	}
}

package exam02;

import java.util.Scanner;

public class ex041_scannersolution {
	public static void main(String[] args) throws Exception {
//		이름 : Edgar
//		나이 : 25
//		전화번호 : 010-123-4567
		String name = "Edgar";
		int age = 25;
		String tel1="010", tel2="123", tel3="4567";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.printf("전화번호 : %s-%s-%s\n", tel1, tel2, tel3);
		
		///// 사용자에게 입력 받은 수 더하기
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 수 :");
		String no1 = scanner.nextLine();
		
		System.out.println("두번째 수 :");
		String no2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(no1);
		int num2 = Integer.parseInt(no2);
		int result = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, result);
		
		///Scanner�� �̿��Ͽ� �̸�, �ֹι�ȣ ��6�ڸ�, ��ȭ��ȣ�� Ű���忡�� �Է¹ް� ����Ͻÿ�
	
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("이름 : ");
		String name1 = scanner1.nextLine();
		
		System.out.println("주민번호 앞 6자리");
		String personalNo = scanner1.nextLine();
		
		System.out.println("전화번호 : ");
		String telNo = scanner1.nextLine();
		
		System.out.println();
		
		System.out.println("이름: " + name1);
		System.out.println("주민번호 : " + personalNo);
		System.out.println("전화번호 : " + telNo);
		
	}
	
}

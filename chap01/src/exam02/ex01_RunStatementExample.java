package exam02;

public class ex01_RunStatementExample {

	public static void main(String[] args) {
		
		//////////////���� ���� �� �ʱ�ȭ//////////////
		int x,y,z; // == int x; int y; int z;
		x = 90; // x���� 90�� ó������ �����ϴ� ���� "�ʱ�ȭ", 90�� "�ʱⰪ"
		
		int value = x + 10;
		int result = value + 10;
		System.out.println(result);
		
		int hour = 3;
		int minute = 15;
		System.out.println("현재시각 " + hour + "시 " + minute +"분");
		
		int totalMinute = (hour * 60) + minute;
		System.out.println(hour + "시" +  minute + "분");
		System.out.println("총" + totalMinute + "분");
		
		////////////진수에 따른 표기법/////////////////////
		int var1 = 0b1011; // 2진수
		int var2 = 0206; // 4진수
		int var3 = 365; // 10진수
		int var4 = 0xB3; //16진수
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		byte var_1 = -128;
		byte var_2 = -30;
		byte var_3 = 0;
		byte var_4 = 30;
		byte var_5 = 127;
		
		System.out.println(var_1);
		System.out.println(var_2);
		System.out.println(var_3);
		System.out.println(var_4);
		System.out.println(var_5);
		
	}

}

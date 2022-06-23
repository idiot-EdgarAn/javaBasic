package exam03;

public class ex03_for {

	public static void main(String[] args) {
		// for문
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 합은" + sum + "입니다." );
		
		// 2중 for문
		for (int m = 2; m <= 9; m++) {
			System.out.println("***" + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + "x" + n + "=" + (m*n) );
			}
		}
	}
}

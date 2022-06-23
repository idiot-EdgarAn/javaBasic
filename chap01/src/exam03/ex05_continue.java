package exam03;

public class ex05_continue {

	public static void main(String[] args) {
		//continue를 사용한 for문
		for(int i=1; i <= 10; i++) {
			if(i%2 != 0) {
				continue;				
			}
			System.out.println(i);
		}

	}

}

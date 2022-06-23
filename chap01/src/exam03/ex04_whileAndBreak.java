package exam03;

public class ex04_whileAndBreak {

	public static void main(String[] args) {
		// while문
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		int sum1 = 0;
		int i1 = 1;
			
		while(i1<=100) {
		sum1 += i1;
		i1++;
		}
		System.out.println("1 ~ " + i1 + "까지 합 = " + sum1 );
		
		// break로 while문 종료
		while(true) {
			int num = (int) (Math.random() * 6 ) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		//이중 반복문에서 바깥쪽 반복문 break
		Qutter : for(char upper = 'A'; upper<='Z'; upper++) {
					for(char lower = 'a'; lower <= 'z'; lower++) {
						System.out.println(upper + " - " + lower);
						if(lower == 'g') {
							break Qutter;
						}
					}
		}
		
		
	}

}

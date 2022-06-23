package exam03;

public class ex02_switch {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6 ) + 1;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default :
				System.out.println("6번이 나왔습니다.");
				break;
		}
		
		int time = (int)(Math.random() * 4) + 8;
		
		switch(time) {
			case 8 :
				System.out.println("출근합니다.");
			case 9 :
				System.out.println("회의를 합니다.");
			case 10 :
				System.out.println("업무를 봅니다.");
			default :
				System.out.println("외근을 갑니다.");
		}
		
		char grade = 'A';
		
		switch(grade) {
			case 'a' :
			case 'A' :
				System.out.println("골드회원입니다.");
				break;
			case 'b' :
			case 'B' :
				System.out.println("실버회원입니다.");
				break;
			case 'c' :
			case 'C' :
				System.out.println("일반회원입니다.");
		}
		
		
	}

}

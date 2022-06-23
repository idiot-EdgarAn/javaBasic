package exam03;

public class ex01_if {

	public static void main(String[] args) {
		int score = 89;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		else if(score < 85) {
			System.out.println("점수가 85보다 작습니다.");
			System.out.println("등급은 C입니다.");
		}
		else {
			System.out.println("점수가 85~89 사이입니다.");
			System.out.println("등급은 B입니다.");
		}
	}

}

package exam02;

public class ex03_systemInCode {
	public static void main(String[] args) throws Exception {
		
		int keyCode1;
		
		keyCode1 = System.in.read();
		System.out.println("keyCode1: " + keyCode1);
		
		keyCode1 = System.in.read();
		System.out.println("keyCode1: " + keyCode1);
		
		keyCode1 = System.in.read();
		System.out.println("keyCode1: " + keyCode1);
		
		int keyCode2;
		while(true) {
			keyCode2 = System.in.read();
			System.out.println("keyCode2 : " + keyCode2);
			if(keyCode2 == 113) {
				break;
			}
		}
		System.out.println("종료");
	}
}

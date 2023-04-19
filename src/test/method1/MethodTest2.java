package test.method1;

public class MethodTest2 {
	
	static void printHead(char c, int cnt) {
		for (int i=0;i<cnt;i++) {
			System.out.print(c);
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printHead('♣',30);
		System.out.println("유한대학교 컴소과");
		printHead('↑',20);
		System.out.println("사용자 정의 메소드 작성");
		printHead('♤',10);
		

	}

}

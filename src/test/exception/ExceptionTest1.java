package test.exception;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("* 분자(나누어지는 수)입력");
		int n1=s.nextInt();
		System.out.println("* 분모(나누는 수)입력");
		int n2=s.nextInt();
		try {
		System.out.printf("%d ÷ %d = %d", n1, n2, n1/n2);
		}catch (ArithmeticException e) {
			System.out.println("정수를 정수로 나눌때 분모가 0이면 안됨");
			System.out.print("* 분모(나누는 수)입력");
			n2=s.nextInt();
			System.out.printf("%d ÷ %d = %d ", n1, n2, n1/n2);
		}finally {
			System.out.println(" 프로그램 종료");
		}
		s.close();
	}

}

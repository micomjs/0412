package test.method1;

import java.util.Scanner;

public class MethodTest3 {

	static void printAdd(int n1, int  n2) {
		int result=n1+n2;
		System.out.printf("%d+%d=%d\n", n1,n2,result);
		
		

	}
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		int n1=0, n2=0;
		while(true) {
		System.out.print("정수입력 :");
		n1=s1.nextInt();
		System.out.print("정수입력 : ");
		n2=s1.nextInt();
		printAdd(n1,n2);
		System.out.println("계속 하시겠습니까?(y,n)");
		String cont=s2.nextLine();
		if(cont.equals("n")||cont.equals("no"))
			break;
	}
	System.out.println("프로그램 종료");
	s1.close();
	s2.close();
	}
} 

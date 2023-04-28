package switch_;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("숫자 입력 : ");
		num=scan.nextInt();
		
		switch(num%7) {
		case 1 : System.out.println("월요일"); break;
		case 2 : System.out.println("화요일"); break;
		case 3 : System.out.println("수요일"); break;
		case 4 : System.out.println("목요일"); break;
		case 5 : System.out.println("금요일"); break;
		case 6 : System.out.println("토요일"); break;
		case 0 : System.out.println("일요일"); break;
		}
		System.out.println("다음 문장 실행");
		System.out.println("====================");
	}
		
}


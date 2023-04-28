package switch_;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		int num;
		String home = null;
		String coor = null;

		Scanner scan = new Scanner(System.in);
		
	
		while(true) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록보기");
			System.out.println("숫자를 입력하세요 : ");
			
			num = scan.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("우리집 : ");
				home = scan.next();
				System.out.println("등록완료");
				break;
			case 2:
				System.out.println("회사 : ");
				coor = scan.next();
				System.out.println("등록완료");
				break;
			case 3:
				System.out.println("집 : " + home);
				System.out.println("회사 : " + coor);
				break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
		
		
		
		
	
	}
}

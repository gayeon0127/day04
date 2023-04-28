package if_;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/* if문ㄴ은 단독으로 사용가능 but else문은 if문 다음에 와야 함
		 * 결과적으로 if 또는 else만 실행됨
		 if (조건식) { ; 참인 경우 실행
		 종속문장 
		 } else { ; 거짓인 경우 실행
		 종속문장
		 } 
		 */
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력 : ");
		num = input.nextInt();
		if (num%3==0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		System.out.println("다음 문장 실행 ");
		System.out.println("=======================");
		
		// 수를 입력 받아 0보다 크고 100보다 작으면 정상 아니면 비정상 출력
		System.out.print("수를 입력하세요. : ");
		num = input.nextInt();
		
		if (num>0 && num<100) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
		System.out.println("다음 문장 실행 ");
		System.out.println("=======================");


	}

}

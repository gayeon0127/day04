package if_;

import java.util.Scanner;

public class Ex02 {
	/*
	 * if, else if, else 중 하나만 실행된다
	 * if (조건식) {
	 	종속문장 
	   } else if (조건식) {
	    종속문장 
	    } else if (조건식) {
	    .........
	    else {
	    종속문장 
	    } 
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("수 입력 : ");
		num = input.nextInt();
		if (num>100) {
			System.out.println("100보다 크다.");
		} else if(num>50) {
			System.out.println("50보다 크다.");
		} else if (num>30) {
			System.out.println("30보다 크다.");
		} else {
			System.out.println("30과 같거나 작은 수입니다.");
		}
		System.out.println("다음 문장 실행");
		System.out.println("====================");
		
		// 커피 주문 수를 입력받아 10개 이하는 2000원 10개, 초과의 갯수는 1500원 부과
		
		int coffee;
		int cost;
		
		System.out.print("주문하실 커피 수를 입력하세요 : ");
		coffee = input.nextInt();
		
		
		if (coffee<10) {
			cost = 2000*coffee;
		} else {
			cost = 2000*10 + 1500*(coffee-10);
		}
		System.out.println("주문하신 커피는 " + coffee + "개 이고, "
				+ "가격은 " + cost + "원 입니다.");
		
	}


	
	
	
}



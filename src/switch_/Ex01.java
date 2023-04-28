package switch_;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 *switch(식){
		  case 1 : 종속문장 break;
		  case 2 : 종속문장 break;
		  ....
		  case n : 종속문장 break;
		  default : 종속문장 
		  }
		 */
		
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("수를 입력 : ");
		num=scan.nextInt();
		
		switch (num) {
		case 1 : System.out.println("1 입력"); break;
		case 2 : System.out.println("2 입력"); break;
		default : System.out.println("1,2를 제외한 값 입력");
		}
		System.out.println("다음 문장 실행");
		System.out.println("====================");
	}

}

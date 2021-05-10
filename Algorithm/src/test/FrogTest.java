package test;

import java.util.Scanner;

public class FrogTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x, y, n을 입력해주세요");
		
		/*	
		 * ax - by = n
		 * b = (ax-n) / y
		 * a >= n / x 
		 */
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();
		
		
		int a = 0 ;
		int b = 0 ;
		int t = 0 ; // 임시 변수

		if(n % x == 0) {
			t = n / x; //나머지가 0일때
		} else {
			t = n / x + 1; // 나머지가 0이 아닐때, 올림 처리
		}
		
		//System.out.println("t = "+ t);
		for(a = t ; a<1000 ; a++) {
		
			//System.out.println((a*x-n) % y);
			if((a*x-n) % y==0) { 	// 나머지가 0일때 b값을 구함
				b = (a*x-n)/y;
			
			//System.out.println("(a*x-n)/y = "+ (a*x-n)/y);
			//System.out.println("b = "+ b);
				
				break;  // for문 종료
			}
		} 
		
		System.out.println("a : b = "+ (a+":"+b));	// a와 b의 값(횟수)
		System.out.println(a+b);
	}
}

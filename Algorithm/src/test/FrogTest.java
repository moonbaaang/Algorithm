package test;

import java.util.Scanner;

public class FrogTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x, y, n�� �Է����ּ���");
		
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
		int t = 0 ; // �ӽ� ����

		if(n % x == 0) {
			t = n / x; //�������� 0�϶�
		} else {
			t = n / x + 1; // �������� 0�� �ƴҶ�, �ø� ó��
		}
		
		//System.out.println("t = "+ t);
		for(a = t ; a<1000 ; a++) {
		
			//System.out.println((a*x-n) % y);
			if((a*x-n) % y==0) { 	// �������� 0�϶� b���� ����
				b = (a*x-n)/y;
			
			//System.out.println("(a*x-n)/y = "+ (a*x-n)/y);
			//System.out.println("b = "+ b);
				
				break;  // for�� ����
			}
		} 
		
		System.out.println("a : b = "+ (a+":"+b));	// a�� b�� ��(Ƚ��)
		System.out.println(a+b);
	}
}

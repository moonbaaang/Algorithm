package Recursion;

public class Recursion2 {

	// �ڱ� �ڽ��� ȣ���ϴ� �Լ�
	// ������ ������ ���� �� ���ѷ����� ������ �ʰ� �� �� ����
	// base case : ��� �ϳ��� recursion�� ������ �ʴ� ��찡 �����ؾ���
	// recursive case : recursion�� �ݺ��ϴٺ��� �ᱹ base case�� �����ؾ���
	
	public static void main(String[] args) {

	}
	
	// add test
	public static int func(int n) {
		if(n==0) return 0;
		else return n+func(n-1);
	}
	
	// factorial test
	public static int factorial(int n) {
		if(n==0) return 1;
		else return n*factorial(n-1);
	}
	
	// power test
	public static double power(double x, int n) {
		if(n==0) return 1;
		else return x*power(x, n-1);
	}
	
	//fibonacci test
	public static int fibonacci(int n) {
		if(n<2) return n;
		else return fibonacci(n-1)+fibonacci(n-2);
	}
	
	// euclid method test (�ּҰ����)
	public static double gcd(int m, int n) {
		if(m<n) {
			int tmp = m;
			m=n;
			n=tmp; //swap m and n
		}
		if (m%n==0) return n;
		else return gcd(n, m%n); 
	}
	
	// euclid method test > easy ver
	public static int easygcd(int p, int q) {
		if(q==0) return p;
		else return easygcd(q, p%q);
	}
}

package Recursion;

public class Recursion2 {

	// 자기 자신을 호출하는 함수
	// 적절한 구조를 갖출 시 무한루프에 빠지지 않게 할 수 있음
	// base case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야함
	// recursive case : recursion을 반복하다보면 결국 base case로 수렴해야함
	
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
	
	// euclid method test (최소공약수)
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

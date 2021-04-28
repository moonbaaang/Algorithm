package Recursion;

import java.util.Scanner;

public class Recursion3 {
	
	// 간단한 문자열 길이 계산
	/*
	 * if the string is empty > return 0;
	 * else return 1 plus the length of the string that excludes the first character;
	 * 
	 */
	public static void main(String[] args) {
		printCharsReverse("javascript");
		System.out.println();
		
		printInBinary(8);
		System.out.println();
		
		int[] list = {1, 2, 3, 4, 5};
		System.out.println(returnsum(5, list));

	}
	
	public static int length(String str) {
		if(str.equals("")) {
			return 0;
		} else {
			return 1+length(str.substring(1)); //첫글자를 제외한 나머지 문자
		}
	}
	
	public static void printChars(String str) {
		if(str.length()==0) {
			return;
		} else {
			System.out.println(str.charAt(0)); //문자열 첫 글자 리턴
			printChars(str.substring(1)); //첫글자를 제외한 나머지 문자
		}
	}
	
	// 문자열을 뒤집어 프린트
	public static void printCharsReverse(String str) {
		if(str.length()==0) return;
		else {
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
	
	// 10진수를 2진수로 변환하여 출력
	public static void printInBinary(int n) {
		if(n<2) System.out.print(n);
		else {
			printInBinary(n/2);
			System.out.print(n%2);
		}
	}
	
	// 배열의 합 구하기
	public static int returnsum(int n, int [] data) {
		if(n<=0) return 0;
		else return returnsum(n-1, data) + data[n-1];
	}
	
}

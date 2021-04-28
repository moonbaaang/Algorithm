package Recursion;

import java.util.Scanner;

public class Recursion3 {
	
	// ������ ���ڿ� ���� ���
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
			return 1+length(str.substring(1)); //ù���ڸ� ������ ������ ����
		}
	}
	
	public static void printChars(String str) {
		if(str.length()==0) {
			return;
		} else {
			System.out.println(str.charAt(0)); //���ڿ� ù ���� ����
			printChars(str.substring(1)); //ù���ڸ� ������ ������ ����
		}
	}
	
	// ���ڿ��� ������ ����Ʈ
	public static void printCharsReverse(String str) {
		if(str.length()==0) return;
		else {
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
	
	// 10������ 2������ ��ȯ�Ͽ� ���
	public static void printInBinary(int n) {
		if(n<2) System.out.print(n);
		else {
			printInBinary(n/2);
			System.out.print(n%2);
		}
	}
	
	// �迭�� �� ���ϱ�
	public static int returnsum(int n, int [] data) {
		if(n<=0) return 0;
		else return returnsum(n-1, data) + data[n-1];
	}
	
}

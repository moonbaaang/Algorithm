package Recursion;

public class Recursion5 {
	
	// 최대값 찾기
	int findMax(int [] data, int begin, int end) {
		if(begin==end) return data[begin];
		else return Math.max(data[begin], findMax(data, begin+1, end));
	}
	
	int findMax2(int [] data, int begin, int end) {
		if(begin==end) return data[begin];
		else {
			int middle = (begin+end)/2;
			int max1 = findMax2(data, begin, middle);
			int max2 = findMax2(data, middle+1, end);
			return Math.max(max1, max2);
		}
	}
	
	
	public static int binarySearch(String[] items, String target, int begin, int end) {
		if(begin>end) return -1;
		else {
			int middle = (begin+end)/2;
			int compResult = target.compareTo(items[middle]);
			if(compResult == 0) return middle;
			else if (compResult<0) return binarySearch(items, target, begin, middle-1);
			else return binarySearch(items, target, middle+1, end);
		}
	}
}

package Recursion;


// ¼øÂ÷ Å½»ö
public class Recursion4 {
	int search(int [] data, int begin, int end, int target) {
		if(begin>end) return -1;
		else if (target == data[begin]) {
			return begin;
		} else {
			return search(data, begin++, end, target);
		}
	}
	
	int search2(int [] data, int begin, int end, int target) {
		if(begin>end) {
			return -1;
		} else {
			int middle = (begin+end)/2;
			if(data[middle]==target)
				return middle;
			int index = search2(data, begin, middle-1, target);
			if(index != -1) return index;
			else return search(data, middle+1, end, target);
		}
	}
}

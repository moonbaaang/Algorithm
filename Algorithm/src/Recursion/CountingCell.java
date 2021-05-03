package Recursion;

public class CountingCell {
	/* 
	 * �Է�
	 * N*N ũ���� 2���� �׸���
	 * �ϳ��� ��ǥ
	 * 
	 * ���
	 * �ȼ� (x,y)�� ���Ե� blob�� ũ��
	 * (x,y)�� � blob���� ������ �ʴ� ��� 0
	 *
	 *	���� �ȼ��� ���� blob�� ũ�� Ű��Ʈ
	 * ���� �ȼ��� image color�� �ƴ϶�� 0 ��ȯ
	 * 
	 * ���� ���� �ȼ� count = 1
	 * �ߺ� ī��Ʈ ������ �ٸ� ������ ĥ��
	 * ���� �ȼ��� �̿��� ��� �ȼ��鿡 ���� �� �ȼ��� ���� blob�� ũ�⸦ ī��Ʈ�� ī���Ϳ� ����
	 * ī���͸� ��ȯ
	 */
	
	private static int BACKGROUND_COLOR = 0;
	private static int IMAGE_COLOR = 1;
	private static int ALREADY_COUNTED = 2;
	
	private static int N = 6;
	private static int [][]grid = {
			{0, 1, 1, 0, 0, 1},
			{1, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 0},
			{1, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0},
			{1, 0, 0, 0, 0, 0}
	};
	public int countCells(int x, int y) {
		int result;
		if(x<0||x>=N||y<0||y>=N) return 0;
		else if (grid[x][y] != IMAGE_COLOR) return 0;
		else {
			grid[x][y] = ALREADY_COUNTED;
			return 1 + countCells(x-1, y+1) + countCells(x, y+1) + countCells(x+1, y+1)
			+ countCells(x+1, y) + countCells(x+1, y-1) + countCells(x, y-1)
			+ countCells(x-1, y-1) + countCells(x-1, y);
		}
	}
	
}

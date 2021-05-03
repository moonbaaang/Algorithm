package Recursion;

public class maze {
	/*
	 * ���� ��ġ���� �ⱸ���� ���� ��ΰ� ��������
	 * 1. ���� ��ġ�� �ⱸ�̰ų�
	 * 2. �̿��� ���� �� �ϳ����� ���� ��ġ�� ������ �ʰ� �ⱸ���� ���� ��ΰ� �ְų�
	 */
	private static int N=8;
	private static int [][] maze = {
			{0, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 0}
	};
	
	private static final int PATHWAY_COLOUR = 0; //white
	private static final int WALL_COLOUR = 1;  //blue
	private static final int BLOCKED_COLOUR = 2; //red, visited, �ⱸ������ ��λ� ���� ������ ������ cell
	private static final int PATH_COLOUR = 3; //green, visited�̳� �ⱸ�� ���� ��ΰ� �� ���ɼ��� �ִ� cell
	
	public static boolean findMazePath(int x, int y) {
		if(x<0 || y<0 || x>=N || y>=N) {
			return false;
		} else if (maze[x][y] != PATHWAY_COLOUR) {
			return false;
		} else if (x==N-1 && y==N-1) {
			maze[x][y] = PATH_COLOUR;
			return true;
		} else {
			maze[x][y] = PATH_COLOUR;
			if(findMazePath(x-1, y) || findMazePath(x,y+1) ||
					findMazePath(x+1,y) || findMazePath(x,y-1)) {
				return true;
			}
			maze[x][y] = BLOCKED_COLOUR; //DEAD END
			return false;
		}		
	}

	public static void main(String args[]) {

		findMazePath(0,0);
//		print(maze);	
	}	
}

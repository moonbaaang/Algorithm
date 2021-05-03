package Recursion;

public class CountingCell {
	/* 
	 * 입력
	 * N*N 크기의 2차원 그리드
	 * 하나의 좌표
	 * 
	 * 출력
	 * 픽셀 (x,y)가 포함된 blob의 크기
	 * (x,y)가 어떤 blob에도 속하지 않는 경우 0
	 *
	 *	현재 픽셀이 속한 blob의 크기 키운트
	 * 현재 픽셀이 image color가 아니라면 0 반환
	 * 
	 * 먼저 현재 픽셀 count = 1
	 * 중복 카운트 방지로 다른 색으로 칠함
	 * 현재 픽셀에 이웃한 모든 픽셀들에 대해 그 픽셀이 속한 blob의 크기를 카운트해 카운터에 더함
	 * 카운터를 반환
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

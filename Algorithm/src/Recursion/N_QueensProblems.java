package Recursion;

public class N_QueensProblems {
	/*
	 * 상태공간트리 - 찾는 해를 포함하는 트리
	 * 즉 해가 존재한다면 그것은 반드시 이 트리의 어떤 한 노드에 해당
	 * 따라서 이 트리를 체계적으로 탐색 시 해를 구할 수 있음
	 * 모든 노드를 탐색해야 하는 것은 아님(non-promising)
	 * 
	 * Backtracking (되추적기법)
	 * 상태공간 트리를 깊이우선 방식으로 탐색하여 해를 찾는 알고리즘
	 */
	
	int [] cols = new int [N+1];
	boolean queens(int level) {
		if(!promising(level)) return false;
		else if success return
	}
}

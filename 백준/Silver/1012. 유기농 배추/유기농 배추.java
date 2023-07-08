import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int n, m, k;
	static int test;
	static int[][] arr;
	static boolean[][] visited;
	static int max;
	static int cnt;
	static int[] dx = {0,0,-1,1}; //아래위좌우
	static int[] dy = {-1,1,0,0};
	
	
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		test = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<test;i++) {
			st = new StringTokenizer(bf.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			cnt = 0;
			arr = new int[n][m];
			visited = new boolean[n][m];
			for(int j=0; j<k;j++) {
				st = new StringTokenizer(bf.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[y][x] = 1;
			}
			
			for(int p = 0; p<n ; p++) {
				for(int q =0; q<m; q++) {
					if(!visited[p][q]&&arr[p][q] ==1) {
						cnt++;
						visited[p][q] = true;
						dfs(p,q);
					}
				}
			}			
			System.out.println(cnt);
			
		}
	
	}




	private static void dfs(int y, int x) {
		
		for(int i=0; i<4; i++) {
			int ny = y+ dy[i];
			int nx = x+ dx[i];
			
			if(ny<0||nx<0||ny>n-1||nx>m-1||visited[ny][nx]||arr[ny][nx]==0) {
				continue;
			}
			visited[ny][nx] = true;
			dfs(ny,nx);
		}
		
		
	}
}
	
	
	
	

	



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][]a = new int[N+1][N+1];
		for(int i = 1; i<=N; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 1; j<=N; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
			
		}
		//합배열 담기
		int[][]d = new int[N+1][N+1];
		for(int i =1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				d[i][j] = d[i][j-1]+d[i-1][j]-d[i-1][j-1]+a[i][j];
				
			}
		}
		
		int result = 0;
		int i1 = 0;
		int j1 = 0;
		int i2 = 0;
		int j2 = 0;
		for(int i = 1; i<M+1;i++) {
			st = new StringTokenizer(bf.readLine());
			i1 = Integer.parseInt(st.nextToken());
			j1 = Integer.parseInt(st.nextToken());
			i2 = Integer.parseInt(st.nextToken());
			j2 = Integer.parseInt(st.nextToken());
			
			result = d[i2][j2]-d[i2][j1-1]-d[i1-1][j2]+d[i1-1][j1-1];
			System.out.println(result);
		}
		
	}
	

}


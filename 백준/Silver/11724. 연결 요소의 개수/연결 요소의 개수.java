import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] arr;
	static boolean visited[];
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
	
		arr = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for(int i =1; i<n+1; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s =  Integer.parseInt(st.nextToken());
			int e =  Integer.parseInt(st.nextToken());
			arr[s].add(e);
			
			arr[e].add(s);
		}
		
		int cnt = 0;
		for(int i = 1; i<n+1; i++) {
			if(!visited[i]) {
				cnt++;
				DFS(i);
			}
		}
          System.out.println(cnt);
		
	}


	static void DFS(int j) {
		if(visited[j]) {
			return;
		}
		visited[j] = true;
		for(int i : arr[j]) {
			if(visited[i]==false) {
				DFS(i);
			}
		}
		
	}
	

	
}

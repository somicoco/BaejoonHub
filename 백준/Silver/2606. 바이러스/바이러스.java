import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean []visited;
    static int [][] arr;
    static int node;
    static int m;

    static int start = 1;

    static int count = 0;



    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        node = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        m = Integer.parseInt(st.nextToken());

        arr = new int[node+1][node+1];
        visited = new boolean[node+1];

        for(int i=0; i<m; i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(start);
        System.out.println(count);

    }

    private static void dfs(int start) {
        visited[start] = true;

        for(int i=1; i<node+1;i++){
            if(visited[i]==false&&arr[start][i]==1){
                visited[i] = true;
                count ++;
                dfs(i);
            }
        }
    }
}
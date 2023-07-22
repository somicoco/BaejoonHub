import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static Character[][] arr;
    static Character[][] arr2;
    static boolean[][] visited;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static int count = 0;

    static int count2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(br.readLine());
        arr = new Character[n][n];
        arr2 = new Character[n][n];

        visited = new boolean[n][n];

        for (int i=0;i<n; i++){
            String s = br.readLine();
            for (int j=0; j<n; j++){
                arr[i][j] = s.charAt(j);
                if (arr[i][j]=='R'||arr[i][j]=='G'){
                    arr2[i][j] = 'R';
                }else {
                    arr2[i][j] = s.charAt(j);
                }
            }
        }
        for (int i=0;i<n; i++){
            for (int j=0; j<n; j++){
                if (visited[i][j]==false){
                    visited[i][j] = true;
                    dfs(i,j,arr[i][j],arr);
                    count++;
                }
            }
        }
        visited = new boolean[n][n];

        for (int i=0;i<n; i++){
            for (int j=0; j<n; j++){
                if (visited[i][j]==false){
                    visited[i][j] = true;
                    dfs(i,j,arr2[i][j],arr2);
                    count2++;
                }
            }
        }



        System.out.println(count);
        System.out.println(count2);

    }

    static void dfs(int y, int x, Character color, Character[][] arr) {

        for (int i=0; i<4; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextY<0||nextX<0||nextX>=n||nextY>=n||visited[nextY][nextX]==true||arr[nextY][nextX]!=color){
                continue;
            }
            visited[nextY][nextX] = true;
            dfs(nextY,nextX, color, arr);



        }
    }
}